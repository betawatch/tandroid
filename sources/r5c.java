// default package

import android.content.Context;
import android.text.TextUtils;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class r5c extends cw9 {
    public final /* synthetic */ d6c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5c(d6c d6cVar, Context context, vnb vnbVar) {
        super(context, 14.0f, vnbVar);
        this.f = d6cVar;
    }

    @Override // cw9
    public final void a(String str) {
        z4b z4bVar = this.f.w;
        y4b y4bVar = z4bVar.T;
        int i = z4bVar.c;
        if (z4bVar.O != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(z4bVar.O, true);
            z4bVar.O = 0;
        }
        if (z4bVar.P != 0) {
            ConnectionsManager.getInstance(i).cancelRequest(z4bVar.P, true);
            z4bVar.P = 0;
        }
        if (TextUtils.isEmpty(str)) {
            z4bVar.S = null;
            z4bVar.G.clear();
            z4bVar.J.clear();
            z4bVar.F.clear();
            z4bVar.e.b(false);
            z4bVar.f();
        } else {
            z4bVar.S = str.toLowerCase();
        }
        hl.r(y4bVar);
        hl.d3(y4bVar, 300L);
    }
}
