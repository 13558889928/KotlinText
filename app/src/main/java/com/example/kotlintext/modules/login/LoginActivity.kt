package com.example.kotlintext.modules.login

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlintext.MainActivity
import com.example.kotlintext.R
import com.example.kotlintext.api.WanAndroidAPI
import com.example.kotlintext.base.BaseActivity
import com.example.kotlintext.entity.LoginResponse
import com.example.kotlintext.modules.login.inter.LoginPresenter
import com.example.kotlintext.modules.login.inter.LoginView
import com.example.kotlintext.modules.register.RegisterActivity
import com.example.kotlintext.net.APIClient
import com.example.kotlintext.net.APIResponse
import com.xiangxue.kotlinproject.config.Flag
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_user_login.*

/**
 * @author YQL
 * @date :2020/6/24 10:50
 * @description:
 */
class LoginActivity : BaseActivity<LoginPresenterImpl>(), LoginView {
    val isEmpty get() = 1111 == 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)

        user_login_bt.setOnClickListener(onClickListener)
        user_register_tv.setOnClickListener(onClickListener)
        user_register_tv.setOnClickListener{
            view ->
            println("测试view:$view.id")
        }


    }

    private val onClickListener = View.OnClickListener { view ->
        when (view.id) {
            R.id.user_login_bt -> {
                val userNameStr = user_phone_et.text.toString()
                val userPwsStr = user_password_et.text.toString()
                presenter.loginAction(this@LoginActivity, userNameStr, userPwsStr)
            }
            R.id.user_register_tv->{
                val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
                startActivity(intent)
            }
        }
    }

    override fun createPresenter(): LoginPresenterImpl = LoginPresenterImpl(this)

    override fun recycler() {
        presenter.unAttachView()
    }

    override fun loginSuccess(loginBean: LoginRegisterResponse?) {
        Toast.makeText(this@LoginActivity, "登录成功😀", Toast.LENGTH_SHORT).show()
        val intent = Intent(this@LoginActivity,  MainActivity::class.java)
        startActivity(intent)
    }

    override fun loginFialure(erroeMsg: String?) {
        Toast.makeText(this@LoginActivity, "登录失败 ~ 呜呜呜", Toast.LENGTH_SHORT).show()
    }
}


