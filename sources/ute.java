// default package

import j$.util.Objects;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ute {
    public static String a(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str2 = ((y1c) obj).a.g.t;
            if (dg7.m(str2)) {
                return "video/mp4";
            }
            if (dg7.i(str2)) {
                z = true;
            } else if (dg7.k(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z ? "audio/mp4" : str != null ? str : "application/mp4";
    }
}
