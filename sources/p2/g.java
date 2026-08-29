package p2;

import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g {
    public int a;
    public int b;
    public String c;

    public static l3.a a() {
        l3.a aVar = new l3.a();
        aVar.b = 0;
        aVar.c = "";
        return aVar;
    }

    public final String toString() {
        int i10 = this.a;
        int i11 = com.google.android.gms.internal.play_billing.u.a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.c;
        Integer valueOf = Integer.valueOf(i10);
        return l1.n("Response Code: ", (!a0Var.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.j.b : (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf)).toString(), ", Debug Message: ", this.c);
    }
}
