// default package

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ym7 {
    public boolean a;
    public boolean b;
    public int c;
    public int d;
    public TLRPC.Document e;
    public String f;
    public String g;

    public final Uri a(int i) {
        if (!TextUtils.isEmpty(this.g)) {
            return Uri.fromFile(new File(this.g));
        }
        TLRPC.Document document = this.e;
        if (document == null) {
            return null;
        }
        String str = document.file_name_fixed;
        String A = ba4.A(document);
        if (A == null) {
            return null;
        }
        String lowerCase = A.toLowerCase();
        if (!str.endsWith(lowerCase)) {
            str = tb4.y(str, ".", lowerCase);
        }
        File file = new File(gl.D0(), str);
        if (!file.exists()) {
            try {
                ba4.G(i);
                gl.E(ba4.I(this.e), file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Uri.fromFile(file);
    }
}
