package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xp0 extends mq0 {
    public final org.telegram.messenger.ic a;
    public final /* synthetic */ sq0 b;
    public final /* synthetic */ org.telegram.messenger.gj c;
    public final /* synthetic */ org.telegram.messenger.ff d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ PhotoViewer g;

    public xp0(PhotoViewer photoViewer, sq0 sq0Var, org.telegram.messenger.gj gjVar, org.telegram.messenger.ff ffVar, boolean z10, boolean z11) {
        this.g = photoViewer;
        this.b = sq0Var;
        this.c = gjVar;
        this.d = ffVar;
        this.e = z10;
        this.f = z11;
        this.a = photoViewer.C4.p();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        sq0 sq0Var = this.b;
        if (sq0Var != null) {
            return sq0Var.E(this.c, null, 0, z10, false);
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void M(org.telegram.messenger.g20 g20Var) {
        org.telegram.messenger.ff ffVar = this.d;
        if (ffVar.w || ffVar.v || ffVar.u || g20Var != null || !TextUtils.isEmpty(ffVar.a)) {
            d0(g20Var, false, 0, true, false);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.gj V() {
        return this.c;
    }

    public final void d0(org.telegram.messenger.g20 g20Var, boolean z10, int i7, boolean z11, boolean z12) {
        PhotoViewer photoViewer = this.g;
        if (photoViewer.l4 != null) {
            qm qmVar = null;
            org.telegram.messenger.gj gjVar = this.c;
            org.telegram.messenger.gj gjVar2 = z11 ? gjVar : null;
            org.telegram.messenger.ff ffVar = this.d;
            if (gjVar2 != null && !TextUtils.isEmpty(ffVar.a)) {
                gjVar2.y1 = ffVar.a;
                gjVar2.z1 = ffVar.n;
            }
            if (z11 || gjVar == null) {
                an anVar = photoViewer.l4;
                gjVar = anVar.E5;
                qmVar = anVar.C5;
            }
            qm qmVar2 = qmVar;
            org.telegram.messenger.gj gjVar3 = gjVar;
            if (!ffVar.b) {
                org.telegram.messenger.gj gjVar4 = gjVar2;
                if (ffVar.h != null) {
                    org.telegram.messenger.c accountInstance = photoViewer.l4.getAccountInstance();
                    String str = ffVar.h;
                    String str2 = ffVar.c;
                    long a10 = photoViewer.l4.a();
                    an anVar2 = photoViewer.l4;
                    org.telegram.messenger.ez.Z(accountInstance, str, str2, null, a10, gjVar3, anVar2.m4, qmVar2, ffVar.n, ffVar.r, null, ffVar.x, gjVar4, g20Var, z10, i7, z12, ffVar.a, anVar2.Y8(), 0L, 0L, photoViewer.l4.j9(), photoViewer.l4.x5);
                    return;
                }
                if (ffVar.I != null) {
                    org.telegram.messenger.c accountInstance2 = photoViewer.l4.getAccountInstance();
                    String str3 = ffVar.I;
                    String str4 = ffVar.c;
                    long a11 = photoViewer.l4.a();
                    an anVar3 = photoViewer.l4;
                    org.telegram.messenger.ez.Z(accountInstance2, str3, str4, null, a11, gjVar3, anVar3.m4, qmVar2, ffVar.n, ffVar.r, null, ffVar.x, gjVar4, g20Var, z10, i7, z12, ffVar.a, anVar3.Y8(), 0L, 0L, photoViewer.l4.j9(), photoViewer.l4.x5);
                    return;
                }
                return;
            }
            if (g20Var != null) {
                org.telegram.messenger.c accountInstance3 = photoViewer.l4.getAccountInstance();
                String str5 = ffVar.I;
                long a12 = photoViewer.l4.a();
                an anVar4 = photoViewer.l4;
                org.telegram.messenger.gj gjVar5 = anVar4.m4;
                ArrayList arrayList = ffVar.n;
                org.telegram.messenger.gj gjVar6 = gjVar2;
                org.telegram.messenger.ez.b0(ffVar.x, i7, 0, a12, 0L, 0L, photoViewer.l4.j9(), ffVar.a, str5, null, arrayList, accountInstance3, gjVar3, gjVar5, gjVar6, photoViewer.l4.x5, anVar4.Y8(), g20Var, null, null, qmVar2, z10, z12, ffVar.M);
                return;
            }
            org.telegram.messenger.gj gjVar7 = gjVar2;
            org.telegram.messenger.c accountInstance4 = photoViewer.l4.getAccountInstance();
            String str6 = ffVar.I;
            long a13 = photoViewer.l4.a();
            an anVar5 = photoViewer.l4;
            org.telegram.messenger.gj gjVar8 = anVar5.m4;
            ArrayList arrayList2 = ffVar.n;
            org.telegram.messenger.ez.b0(ffVar.x, i7, 0, a13, 0L, 0L, photoViewer.l4.j9(), ffVar.a, str6, null, arrayList2, accountInstance4, gjVar3, gjVar8, gjVar7, photoViewer.l4.x5, anVar5.Y8(), null, null, null, qmVar2, z10, z12, ffVar.M);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.ic j(int i7) {
        return this.a;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        d0(g20Var, z10, i10, false, z11);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean p() {
        return this.b != null && this.e;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean r() {
        return this.b != null && this.f;
    }
}
