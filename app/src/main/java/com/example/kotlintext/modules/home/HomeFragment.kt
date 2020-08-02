package com.example.kotlintext.modules.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kotlintext.R
import com.example.kotlintext.base.BaseFragment
import com.example.kotlintext.db_model.request.NetWorkResultData
import com.example.kotlintext.db_model.request.RequestAPI
import com.example.kotlintext.entity.HomeDataResponse
import com.google.gson.Gson
import com.xiangxue.kotlinproject.config.Flag
import okhttp3.Response

/**
 * @author YQL
 * @date :2020/7/2 17:18
 * @description:
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(activity, "首页", Toast.LENGTH_SHORT).show()
        val root: View? = inflater.inflate(R.layout.fragment_home, container, false)
        return root ?: super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        requestHomeData()
    }

    /**
     * 请求首页的数据集
     */
    fun  requestHomeData(){
        RequestAPI.instanceRequestAction(Flag.SERVER_URL,"1",object :NetWorkResultData(){
            override fun requestError(info: String) {
                Log.e(Flag.TAG,"requestHomeData requestError info:${info}")
            }

            override fun requestSuccess(result: Response) {
                //gson ---bean
                try {
                    val resultData  = result.body()?.string().toString();

                    //Gson 解析成可操作的对象
                    val gson =  Gson()
                    gson.fromJson<>()

                }catch (e:Exception){
                    e.printStackTrace()
                    Log.e(Flag.TAG,"requestSuccess 解析数据是Exception${e.message}")
                }
                showResultSuccess(result)
            }

        })
    }

    // TODO: 2020/8/2 首页画面展示成功
    private fun showResultSuccess(result: HomeDataResponse){
        
    }
}