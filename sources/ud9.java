// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ud9 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public ud9(int i, String str, String... strArr) {
        this.a = i;
        this.b = str;
        this.c = Arrays.asList(strArr);
    }

    public static ArrayList a(String str) {
        String trim = str == null ? "" : str.trim();
        if (trim.startsWith("/")) {
            trim = trim.substring(1);
        }
        String lowerCase = trim.toLowerCase();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = d;
        if (arrayList2 == null) {
            ArrayList arrayList3 = new ArrayList();
            d = arrayList3;
            arrayList3.add(new ud9(R.drawable.iv_h1, jb6.M0(2131753995, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new ud9(R.drawable.iv_h2, jb6.M0(2131753994, null), "##", "/h2"));
            d.add(new ud9(R.drawable.iv_h3, jb6.M0(2131753993, null), "###", "/h3"));
            d.add(new ud9(R.drawable.iv_h4, jb6.M0(2131753992, null), "####", "/h4"));
            d.add(new ud9(R.drawable.iv_h5, jb6.M0(2131753991, null), "#####", "/h5"));
            d.add(new ud9(R.drawable.iv_h6, jb6.M0(2131753990, null), "######", "/h6"));
            d.add(new ud9(R.drawable.iv_quote, jb6.M0(2131753961, null), "|", "/quote"));
            d.add(new ud9(R.drawable.iv_pullquote, jb6.M0(2131753962, null), "/pullquote"));
            d.add(new ud9(R.drawable.iv_code, jb6.M0(2131754020, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new ud9(R.drawable.iv_footer, jb6.M0(2131753997, null), "/footer"));
            d.add(new ud9(R.drawable.iv_list, jb6.M0(2131754016, null), "-", "/list"));
            d.add(new ud9(R.drawable.iv_ordered_list, jb6.M0(2131754013, null), "1."));
            d.add(new ud9(R.drawable.iv_todo, jb6.M0(2131753969, null), "[]", "/todo", "/checklist"));
            d.add(new ud9(R.drawable.iv_details, jb6.M0(2131754011, null), ">", "/toggle", "/details"));
            d.add(new ud9(R.drawable.iv_button, jb6.M0(2131745744, null), "/button"));
            d.add(new ud9(R.drawable.iv_table, jb6.M0(2131754012, null), "/table"));
            d.add(new ud9(R.drawable.iv_math, jb6.M0(2131754014, null), "/math", "/latex", "/expression"));
            d.add(new ud9(R.drawable.iv_divider, jb6.M0(2131754018, null), "---"));
            d.add(new ud9(R.drawable.iv_media, jb6.M0(2131754017, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new ud9(R.drawable.iv_media, jb6.M0(2131754010, null), "/video", "/vid", "/media"));
            d.add(new ud9(R.drawable.iv_audio, jb6.M0(2131754019, null), "/audio", "/music", "/media"));
            d.add(new ud9(R.drawable.iv_location, jb6.M0(2131754015, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ud9 ud9Var = (ud9) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = ud9Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        Iterator it = ud9Var.c.iterator();
                        while (it.hasNext()) {
                            String lowerCase2 = ((String) it.next()).toLowerCase();
                            if (lowerCase2.startsWith("/")) {
                                lowerCase2 = lowerCase2.substring(1);
                            }
                            if (lowerCase2.startsWith(lowerCase)) {
                            }
                        }
                    } else {
                        if (split[i2].startsWith(lowerCase)) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            arrayList.add(ud9Var);
        }
        return arrayList;
    }
}
