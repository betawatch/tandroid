package org.telegram.ui;

import android.media.AudioRecordingConfiguration;
import com.google.firebase.datatransport.TransportRegistrar;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xx0 implements org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.kv0, og.c, org.telegram.ui.Components.yu0, org.telegram.ui.Components.zu0, GenericProvider, a9.e {
    public final /* synthetic */ int a;

    public /* synthetic */ xx0(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override // a9.e
    public Object I0(a5.j jVar) {
        v2.f lambda$getComponents$0;
        lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(jVar);
        return lambda$getComponents$0;
    }

    @Override // org.telegram.ui.Components.zu0
    public void b(Object obj, float f9) {
        switch (this.a) {
            case 23:
                ph.p2 p2Var = (ph.p2) obj;
                p2Var.b = f9;
                p2Var.e.invalidate();
                p2Var.S.setAlpha(f9);
                p2Var.E();
                p2Var.C();
                break;
            case 24:
            default:
                ((ph.m3) obj).setSwipeOffsetY(f9);
                break;
            case 25:
                ((ph.j3) obj).setLoadProgress(f9);
                break;
        }
    }

    @Override // og.c
    public int f(org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        switch (this.a) {
            case 8:
                return pg.a.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, c6Var));
            case 9:
                if (!LiteMode.isEnabled(256)) {
                    return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false);
                }
                return org.telegram.ui.ActionBar.g6.l1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false));
            case 10:
                return pg.a.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Zk, c6Var));
            case 11:
                return org.telegram.ui.ActionBar.g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var));
            case 12:
                return 855638016;
            case 13:
                return TLObject.FLAG_30;
            case 14:
                return org.telegram.ui.ActionBar.g6.l1(0.075f, -16777216);
            case 15:
                return org.telegram.ui.ActionBar.g6.l1(z10 ? 0.85f : 0.825f, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G8, false));
            case 16:
                return pg.a.l(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yk, c6Var));
            case 17:
                return org.telegram.ui.ActionBar.g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            case 18:
                return org.telegram.ui.ActionBar.g6.l1(0.78f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
            case 19:
                return org.telegram.ui.ActionBar.g6.l1(0.7f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
            case 20:
                LiteMode.isEnabled(262144);
                return 0;
            default:
                return org.telegram.ui.ActionBar.g6.l1(LiteMode.isEnabled(262144) ? 0.85f : 0.76f, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                c2Var.dismiss();
                break;
            case 1:
                c2Var.dismiss();
                break;
            case 2:
            default:
                c2Var.dismiss();
                break;
            case 3:
                c2Var.dismiss();
                break;
            case 4:
                c2Var.dismiss();
                break;
            case 5:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.yu0
    public float get(Object obj) {
        switch (this.a) {
            case 22:
                return ((ph.p2) obj).b;
            case 23:
            default:
                return ((ph.m3) obj).getSwipeOffsetY();
            case 24:
                return ((ph.j3) obj).c;
        }
    }

    @Override // org.telegram.ui.Components.kv0
    public void h(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        org.telegram.ui.Components.av0 av0Var = ph.m3.U;
        return Boolean.FALSE;
    }

    @Override // org.telegram.ui.Components.kv0
    public /* synthetic */ void m() {
    }
}
