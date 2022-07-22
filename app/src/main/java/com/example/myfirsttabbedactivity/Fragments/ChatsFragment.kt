package com.example.myfirsttabbedactivity.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.example.myfirsttabbedactivity.CustomAdapter
import com.example.myfirsttabbedactivity.R
import com.example.myfirsttabbedactivity.User

class ChatsFragment : Fragment() {
    var Mlist: ListView?= null
    var user:ArrayList <User> ?=null
    var adapter:CustomAdapter ?=null



    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var root=inflater.inflate(R.layout.fragment_chats, container, false)


        Mlist=root.findViewById(R.id.MlistUsers)
        user=ArrayList()
        adapter=CustomAdapter(ChatsFragment(),user!!)

        var user1=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user2=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user3=User(R.mipmap.imagethree,"King Wanyama","0714000000" )
        var user4=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user5=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user6=User(R.mipmap.imagethree,"King Wanyama","0714000000" )
        var user7=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user8=User(R.mipmap.imagethree,"King Wanyama","0714000000" )
        var user9=User(R.mipmap.imageone,"King Wanyama","0714000000" )
        var user10=User(R.mipmap.imageone,"King Wanyama","0714000000" )

        user!!.add(user1)
        user!!.add(user2)
        user!!.add(user3)
        user!!.add(user4)
        user!!.add(user5)
        user!!.add(user6)
        user!!.add(user7)
        user!!.add(user8)
        user!!.add(user9)
        user!!.add(user10)

//        Assign our custom adapter to the List View
        Mlist!!.adapter=adapter
        return  root
    }


}