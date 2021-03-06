package select.exafrgmple5.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val TAG = "MyTag"
class NewFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "NewFragment - onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "NewFragment - onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_new, container, false)

        Log.d(TAG, "NewFragment - onCreateView")
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "NewFragment - onActivityCreated")
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG,"NewFragment - onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.d(TAG,"NewFragment - onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "NewFragment - onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "NewFragment - onStop")
    }
    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "NewFragment - onDestroyView")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "NewFragment - onDestroy")
    }


}