// default package

import android.net.Uri;
import org.telegram.ui.o;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt implements hcc {
    public final /* synthetic */ o a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ wt d;

    public /* synthetic */ qt(o oVar, String str, boolean[] zArr, wt wtVar) {
        this.a = oVar;
        this.b = str;
        this.c = zArr;
        this.d = wtVar;
    }

    @Override // hcc
    public final Object run() {
        String str = this.b;
        if (!m01.g(Uri.parse(str), false, this.c)) {
            return Boolean.FALSE;
        }
        o oVar = this.a;
        wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.c = new ve2(oVar, wtVar, (byte) 25);
        } else {
            tw twVar = oVar.L;
            if (twVar != null) {
                twVar.a(true);
            }
        }
        m01.t(oVar.M, Uri.parse(str), true, true, false, wtVar, null, true, true, false, false);
        return Boolean.TRUE;
    }
}
