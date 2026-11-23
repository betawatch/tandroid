package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.VelocityTracker;
import java.io.File;
import java.io.Serializable;
import java.util.Collections;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tn0 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Serializable f;
    public final /* synthetic */ Object h;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tn0(ro0 ro0Var, int[] iArr, int[] iArr2, boolean z10, boolean z11, boolean z12) {
        this.e = ro0Var;
        this.f = iArr;
        this.h = iArr2;
        this.b = z10;
        this.c = z11;
        this.d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        Object obj = this.h;
        Serializable serializable = this.f;
        Object obj2 = this.e;
        switch (i7) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj2;
                File file = (File) serializable;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                Pair L0 = org.telegram.messenger.g0.L0(file);
                int i10 = photoViewer.V3;
                photoViewer.V3 = i10 - 1;
                String absolutePath = file.getAbsolutePath();
                boolean z10 = this.b;
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(i10, absolutePath, z10 ? 0 : ((Integer) L0.first).intValue(), z10, 0, 0);
                ffVar.n(L0);
                photoViewer.d2 = 2;
                photoViewer.v2 = false;
                photoViewer.d = new zp0(photoViewer, photoViewer.d, gjVar, ffVar, this.c, this.d);
                photoViewer.q1.f();
                if (photoViewer.U6 == null) {
                    photoViewer.U6 = VelocityTracker.obtain();
                }
                photoViewer.B7 = 3;
                photoViewer.n3(false, false);
                photoViewer.h3(true, false);
                bn bnVar = photoViewer.l4;
                if (bnVar == null || bnVar.a0 == null || !bnVar.V9()) {
                    photoViewer.Q1();
                } else {
                    photoViewer.l4.a0.U();
                }
                photoViewer.M0.setAlpha(org.telegram.messenger.ls.e4);
                photoViewer.f0.setAlpha(1.0f);
                photoViewer.X1(null, null, null, null, null, null, Collections.singletonList(ffVar), 0, null);
                photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(photoViewer.s1 ? 154.0f : 96.0f));
                photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(photoViewer.s1 ? 154.0f : 96.0f));
                photoViewer.G.setTranslationY(-r0.getHeight());
                photoViewer.R1.setTranslationY(org.telegram.messenger.g0.L(photoViewer.s1 ? 154.0f : 96.0f));
                photoViewer.E0();
                photoViewer.e3();
                photoViewer.B7 = 0;
                break;
            default:
                ro0 ro0Var = (ro0) obj2;
                int[] iArr = (int[]) serializable;
                int i11 = iArr[0] + 1;
                iArr[0] = i11;
                int i12 = ((int[]) obj)[0];
                if (i11 == i12) {
                    qq0 qq0Var = ro0Var.b.f0;
                    boolean z11 = this.b;
                    int i13 = (this.c ? 1 : 0) + (z11 ? 1 : 0);
                    boolean z12 = this.d;
                    new org.telegram.ui.Components.lc(qq0Var, null).m(i13 + (z12 ? 1 : 0) > 1 ? org.telegram.ui.Components.kc.w : z12 ? i12 > 1 ? org.telegram.ui.Components.kc.s : org.telegram.ui.Components.kc.r : z11 ? i12 > 1 ? org.telegram.ui.Components.kc.n : org.telegram.ui.Components.kc.h : i12 > 1 ? org.telegram.ui.Components.kc.f : org.telegram.ui.Components.kc.e, i12, -115203550, -1, null).j();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ tn0(PhotoViewer photoViewer, File file, boolean z10, org.telegram.messenger.gj gjVar, boolean z11, boolean z12) {
        this.e = photoViewer;
        this.f = file;
        this.b = z10;
        this.h = gjVar;
        this.c = z11;
        this.d = z12;
    }
}
