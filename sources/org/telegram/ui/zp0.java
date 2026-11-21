package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class zp0 extends oq0 {
    public final org.telegram.messenger.hc a;
    public final /* synthetic */ uq0 b;
    public final /* synthetic */ org.telegram.messenger.fj c;
    public final /* synthetic */ org.telegram.messenger.ef d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public zp0(PhotoViewer photoViewer, uq0 uq0Var, org.telegram.messenger.fj fjVar, org.telegram.messenger.ef efVar, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = uq0Var;
        this.c = fjVar;
        this.d = efVar;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.C4.p();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        uq0 uq0Var = this.b;
        if (uq0Var != null) {
            return uq0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void M(org.telegram.messenger.e20 e20Var) {
        org.telegram.messenger.ef efVar = this.d;
        if (efVar.w || efVar.v || efVar.u || e20Var != null || !TextUtils.isEmpty(efVar.a)) {
            d0(e20Var, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.fj V() {
        return this.c;
    }

    public final void d0(org.telegram.messenger.e20 e20Var, boolean z10, int i7, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.l4 != null) {
            rm rmVar = null;
            org.telegram.messenger.fj fjVar = this.c;
            org.telegram.messenger.fj fjVar2 = z11 ? fjVar : null;
            org.telegram.messenger.ef efVar = this.d;
            if (fjVar2 != null && !TextUtils.isEmpty(efVar.a)) {
                fjVar2.y1 = efVar.a;
                fjVar2.z1 = efVar.n;
            }
            if (z11 || fjVar == null) {
                bn bnVar = photoViewer.l4;
                fjVar = bnVar.F5;
                rmVar = bnVar.D5;
            }
            rm rmVar2 = rmVar;
            org.telegram.messenger.fj fjVar3 = fjVar;
            if (!efVar.b) {
                org.telegram.messenger.fj fjVar4 = fjVar2;
                if (efVar.h != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.l4.getAccountInstance();
                    String str = efVar.h;
                    String str2 = efVar.c;
                    long a10 = photoViewer.l4.a();
                    bn bnVar2 = photoViewer.l4;
                    org.telegram.messenger.zy.Z(accountInstance, str, str2, null, a10, fjVar3, bnVar2.m4, rmVar2, efVar.n, efVar.r, null, efVar.x, fjVar4, e20Var, z10, i7, z12, efVar.a, bnVar2.Y8(), 0L, 0L, photoViewer.l4.j9(), photoViewer.l4.y5);
                    return;
                }
                if (efVar.I != null) {
                    org.telegram.messenger.c accountInstance2 = photoViewer.l4.getAccountInstance();
                    String str3 = efVar.I;
                    String str4 = efVar.c;
                    long a11 = photoViewer.l4.a();
                    bn bnVar3 = photoViewer.l4;
                    org.telegram.messenger.zy.Z(accountInstance2, str3, str4, null, a11, fjVar3, bnVar3.m4, rmVar2, efVar.n, efVar.r, null, efVar.x, fjVar4, e20Var, z10, i7, z12, efVar.a, bnVar3.Y8(), 0L, 0L, photoViewer.l4.j9(), photoViewer.l4.y5);
                    return;
                }
                return;
            }
            if (e20Var != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.l4.getAccountInstance();
                String str5 = efVar.I;
                long a12 = photoViewer.l4.a();
                bn bnVar4 = photoViewer.l4;
                org.telegram.messenger.fj fjVar5 = bnVar4.m4;
                ArrayList arrayList = efVar.n;
                org.telegram.messenger.fj fjVar6 = fjVar2;
                org.telegram.messenger.zy.b0(efVar.x, i7, 0, a12, 0L, 0L, photoViewer.l4.j9(), efVar.a, str5, null, arrayList, accountInstance3, fjVar3, fjVar5, fjVar6, photoViewer.l4.y5, bnVar4.Y8(), e20Var, null, null, rmVar2, z10, z12, efVar.M);
                return;
            }
            org.telegram.messenger.fj fjVar7 = fjVar2;
            org.telegram.messenger.c accountInstance4 = photoViewer.l4.getAccountInstance();
            String str6 = efVar.I;
            long a13 = photoViewer.l4.a();
            bn bnVar5 = photoViewer.l4;
            org.telegram.messenger.fj fjVar8 = bnVar5.m4;
            ArrayList arrayList2 = efVar.n;
            org.telegram.messenger.zy.b0(efVar.x, i7, 0, a13, 0L, 0L, photoViewer.l4.j9(), efVar.a, str6, null, arrayList2, accountInstance4, fjVar3, fjVar8, fjVar7, photoViewer.l4.y5, bnVar5.Y8(), null, null, null, rmVar2, z10, z12, efVar.M);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.hc j(int i7) {
        return this.a;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(e20Var, z10, i10, false, z11);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean r() {
        return this.b != null && this.f;
    }
}
