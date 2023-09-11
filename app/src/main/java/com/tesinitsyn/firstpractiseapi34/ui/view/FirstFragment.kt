package com.tesinitsyn.firstpractiseapi34.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import com.tesinitsyn.firstpractiseapi34.R
import com.tesinitsyn.firstpractiseapi34.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val formattedText = "<i>Зло – это зло, Стрегобор</i><br>– серьезно сказал ведьмак, вставая.<br>" +
                " <i>– Меньшее, большее, среднее – все едино, пропорции условны, а границы размыты. Я не святой отшельник," +
                " не только одно добро творил в жизни. Но если приходится выбирать между одним злом и другим, я предпочитаю не выбирать вообще.</i>\n" +
                "<b><br>        Геральт из Ривии, ведьмак </b>"
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.firstFragmentText.text = HtmlCompat.fromHtml(formattedText, HtmlCompat.FROM_HTML_MODE_LEGACY)
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragment().apply {
                arguments = Bundle().apply {
                }
            }
    }
}