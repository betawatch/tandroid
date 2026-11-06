package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yp0 extends nq0 {
    public final org.telegram.messenger.jc a;
    public final /* synthetic */ uq0 b;
    public final /* synthetic */ org.telegram.messenger.ij c;
    public final /* synthetic */ org.telegram.messenger.gf d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public yp0(PhotoViewer photoViewer, uq0 uq0Var, org.telegram.messenger.ij ijVar, org.telegram.messenger.gf gfVar, boolean z9, boolean z10) {
        this.g = photoViewer;
        this.b = uq0Var;
        this.c = ijVar;
        this.d = gfVar;
        this.e = z9;
        this.f = z10;
        this.a = photoViewer.B4.p();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final wq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        uq0 uq0Var = this.b;
        if (uq0Var != null) {
            return uq0Var.E(this.c, null, 0, z9, false);
        }
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void M(org.telegram.messenger.j20 j20Var) {
        org.telegram.messenger.gf gfVar = this.d;
        if (gfVar.w || gfVar.v || gfVar.u || j20Var != null || !TextUtils.isEmpty(gfVar.a)) {
            d0(j20Var, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.ij V() {
        return this.c;
    }

    public final void d0(org.telegram.messenger.j20 j20Var, boolean z9, int i7, boolean z10, boolean z11) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.k4 != null) {
            qm qmVar = null;
            org.telegram.messenger.ij ijVar = this.c;
            org.telegram.messenger.ij ijVar2 = z10 ? ijVar : null;
            org.telegram.messenger.gf gfVar = this.d;
            if (ijVar2 != null && !TextUtils.isEmpty(gfVar.a)) {
                ijVar2.w1 = gfVar.a;
                ijVar2.x1 = gfVar.n;
            }
            if (z10 || ijVar == null) {
                an anVar = photoViewer.k4;
                ijVar = anVar.D5;
                qmVar = anVar.B5;
            }
            qm qmVar2 = qmVar;
            org.telegram.messenger.ij ijVar3 = ijVar;
            if (!gfVar.b) {
                org.telegram.messenger.ij ijVar4 = ijVar2;
                if (gfVar.h != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.k4.getAccountInstance();
                    String str = gfVar.h;
                    String str2 = gfVar.c;
                    long a10 = photoViewer.k4.a();
                    an anVar2 = photoViewer.k4;
                    org.telegram.messenger.gz.Z(accountInstance, str, str2, null, a10, ijVar3, anVar2.l4, qmVar2, gfVar.n, gfVar.r, null, gfVar.x, ijVar4, j20Var, z9, i7, z11, gfVar.a, anVar2.W8(), 0L, 0L, photoViewer.k4.h9(), photoViewer.k4.w5);
                    return;
                }
                if (gfVar.I != null) {
                    org.telegram.messenger.c accountInstance2 = photoViewer.k4.getAccountInstance();
                    String str3 = gfVar.I;
                    String str4 = gfVar.c;
                    long a11 = photoViewer.k4.a();
                    an anVar3 = photoViewer.k4;
                    org.telegram.messenger.gz.Z(accountInstance2, str3, str4, null, a11, ijVar3, anVar3.l4, qmVar2, gfVar.n, gfVar.r, null, gfVar.x, ijVar4, j20Var, z9, i7, z11, gfVar.a, anVar3.W8(), 0L, 0L, photoViewer.k4.h9(), photoViewer.k4.w5);
                    return;
                }
                return;
            }
            if (j20Var != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.k4.getAccountInstance();
                String str5 = gfVar.I;
                long a12 = photoViewer.k4.a();
                an anVar4 = photoViewer.k4;
                org.telegram.messenger.ij ijVar5 = anVar4.l4;
                ArrayList arrayList = gfVar.n;
                org.telegram.messenger.ij ijVar6 = ijVar2;
                org.telegram.messenger.gz.b0(gfVar.x, i7, 0, a12, 0L, 0L, photoViewer.k4.h9(), gfVar.a, str5, null, arrayList, accountInstance3, ijVar3, ijVar5, ijVar6, photoViewer.k4.w5, anVar4.W8(), j20Var, null, null, qmVar2, z9, z11, gfVar.M);
                return;
            }
            org.telegram.messenger.ij ijVar7 = ijVar2;
            org.telegram.messenger.c accountInstance4 = photoViewer.k4.getAccountInstance();
            String str6 = gfVar.I;
            long a13 = photoViewer.k4.a();
            an anVar5 = photoViewer.k4;
            org.telegram.messenger.ij ijVar8 = anVar5.l4;
            ArrayList arrayList2 = gfVar.n;
            org.telegram.messenger.gz.b0(gfVar.x, i7, 0, a13, 0L, 0L, photoViewer.k4.h9(), gfVar.a, str6, null, arrayList2, accountInstance4, ijVar3, ijVar8, ijVar7, photoViewer.k4.w5, anVar5.W8(), null, null, null, qmVar2, z9, z11, gfVar.M);
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.jc j(int i7) {
        return this.a;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        d0(j20Var, z9, i10, false, z10);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean r() {
        return this.b != null && this.f;
    }
}
