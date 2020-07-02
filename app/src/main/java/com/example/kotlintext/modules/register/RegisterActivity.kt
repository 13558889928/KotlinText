package com.example.kotlintext.modules.register

import android.os.Bundle
import android.widget.Toast
import com.example.kotlintext.R
import com.example.kotlintext.base.BaseActivity
import com.example.kotlintext.modules.register.inter.RegisterPresenter
import com.example.kotlintext.modules.register.inter.RegisterView
import com.xiangxue.kotlinproject.entity.LoginRegisterResponse
import kotlinx.android.synthetic.main.activity_user_register.*

/**
 * @author YQL
 * @date :2020/7/2 15:21
 * @description:
 */
class RegisterActivity : BaseActivity<RegisterPresenter>(), RegisterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_register)

        user_register_bt.setOnClickListener {
            val userName = user_phone_et.text.toString()
            val password = user_password_et.text.toString()
            presenter.registerWanAndroid(this@RegisterActivity, userName, password, password)
        }
    }

    override fun createPresenter(): RegisterPresenter = RegisterPresenterImpl(this)

    override fun recycler() {
        presenter.unAttachView()
    }

    override fun registerSuccess(registerBean: LoginRegisterResponse?) {
        Toast.makeText(this, "注册成功😀", Toast.LENGTH_SHORT).show()
    }

    override fun registerFailed(errorMsg: String?) {
        Toast.makeText(this, "注册失败 ~ 呜呜呜", Toast.LENGTH_SHORT).show()
    }
}