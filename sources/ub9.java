// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ub9 {
    public static ArrayList d;
    public final int a;
    public final String b;
    public final List c;

    public ub9(int i, String str, String... strArr) {
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
            arrayList3.add(new ub9(R.drawable.iv_h1, k96.M0(2131754027, null), "#", "/h1", "/header", "/title", "/heading"));
            d.add(new ub9(R.drawable.iv_h2, k96.M0(2131754026, null), "##", "/h2"));
            d.add(new ub9(R.drawable.iv_h3, k96.M0(2131754025, null), "###", "/h3"));
            d.add(new ub9(R.drawable.iv_h4, k96.M0(2131754024, null), "####", "/h4"));
            d.add(new ub9(R.drawable.iv_h5, k96.M0(2131754023, null), "#####", "/h5"));
            d.add(new ub9(R.drawable.iv_h6, k96.M0(2131754022, null), "######", "/h6"));
            d.add(new ub9(R.drawable.iv_quote, k96.M0(2131753993, null), "|", "/quote"));
            d.add(new ub9(R.drawable.iv_pullquote, k96.M0(2131753994, null), "/pullquote"));
            d.add(new ub9(R.drawable.iv_code, k96.M0(2131754052, null), "```", "/code", "/pre", "/preformatted"));
            d.add(new ub9(R.drawable.iv_footer, k96.M0(2131754029, null), "/footer"));
            d.add(new ub9(R.drawable.iv_list, k96.M0(2131754048, null), "-", "/list"));
            d.add(new ub9(R.drawable.iv_ordered_list, k96.M0(2131754045, null), "1."));
            d.add(new ub9(R.drawable.iv_todo, k96.M0(2131754001, null), "[]", "/todo", "/checklist"));
            d.add(new ub9(R.drawable.iv_details, k96.M0(2131754043, null), ">", "/toggle", "/details"));
            d.add(new ub9(R.drawable.iv_button, k96.M0(2131745818, null), "/button"));
            d.add(new ub9(R.drawable.iv_table, k96.M0(2131754044, null), "/table"));
            d.add(new ub9(R.drawable.iv_math, k96.M0(2131754046, null), "/math", "/latex", "/expression"));
            d.add(new ub9(R.drawable.iv_divider, k96.M0(2131754050, null), "---"));
            d.add(new ub9(R.drawable.iv_media, k96.M0(2131754049, null), "/image", "/pic", "/picture", "/photo", "/img", "/media"));
            d.add(new ub9(R.drawable.iv_media, k96.M0(2131754042, null), "/video", "/vid", "/media"));
            d.add(new ub9(R.drawable.iv_audio, k96.M0(2131754051, null), "/audio", "/music", "/media"));
            d.add(new ub9(R.drawable.iv_location, k96.M0(2131754047, null), "/map", "/location", "/venue"));
            arrayList2 = d;
        }
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ub9 ub9Var = (ub9) obj;
            if (!lowerCase.isEmpty()) {
                String[] split = ub9Var.b.toLowerCase().split(" ");
                int length = split.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        Iterator it = ub9Var.c.iterator();
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
            arrayList.add(ub9Var);
        }
        return arrayList;
    }
}
