// default package

import android.content.Context;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ssa implements p8c {
    public final /* synthetic */ gta a;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ i8c e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ wjb g;
    public final /* synthetic */ TLRPC.ChatInvite h;
    public final /* synthetic */ String i;

    public /* synthetic */ ssa(gta gtaVar, long j, int i, boolean[] zArr, i8c i8cVar, Context context, wjb wjbVar, TLRPC.ChatInvite chatInvite, String str) {
        this.a = gtaVar;
        this.b = j;
        this.c = i;
        this.d = zArr;
        this.e = i8cVar;
        this.f = context;
        this.g = wjbVar;
        this.h = chatInvite;
        this.i = str;
    }

    @Override // p8c
    public final void a(Object obj) {
        p8c p8cVar = (p8c) obj;
        gta gtaVar = this.a;
        long j = gtaVar.f.amount;
        long j2 = this.b;
        boolean[] zArr = this.d;
        i8c i8cVar = this.e;
        TLRPC.ChatInvite chatInvite = this.h;
        String str = this.i;
        if (j >= j2) {
            gtaVar.Y(str, chatInvite, new lra(p8cVar, zArr, i8cVar));
            return;
        }
        boolean a5 = na7.q1(this.c).a5();
        Context context = this.f;
        wjb wjbVar = this.g;
        if (a5) {
            boolean[] zArr2 = {false};
            zua zuaVar = new zua(context, wjbVar, j2, 1, chatInvite.title, new i87((Object) gtaVar, (Object) zArr2, (Object) str, (Object) chatInvite, (Object) zArr, (Object) i8cVar, (Object) p8cVar, (byte) 18), 0L);
            zuaVar.setOnDismissListener(new cu0(gtaVar, p8cVar, zArr2, zArr, i8cVar, (byte) 2));
            zuaVar.show();
            return;
        }
        if (p8cVar != null) {
            p8cVar.a(Boolean.FALSE);
        }
        if (!zArr[0]) {
            i8cVar.a("cancelled", 0L);
            zArr[0] = true;
        }
        gta.c0(context, wjbVar);
    }
}
