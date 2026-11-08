package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements p4.c0, p4.a1, h2.j {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.g1 g1Var = (p4.g1) obj;
        switch (this.a) {
            case 20:
                g1Var.B0();
                break;
            case 21:
                g1Var.b();
                break;
            case 22:
                g1Var.g0();
                break;
            case 23:
            default:
                g1Var.J0();
                break;
            case 24:
                g1Var.C0();
                break;
            case 25:
                g1Var.L0();
                break;
            case 26:
                g1Var.U();
                break;
            case 27:
                g1Var.E();
                break;
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        switch (this.a) {
            case 15:
                uVar.getClass();
                break;
            case 16:
                uVar.c(i7);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // p4.a1
    public Object l(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 18:
                d0Var.getClass();
                throw new ClassCastException();
            case 19:
                d0Var.getClass();
                throw new ClassCastException();
            case 23:
                return d0Var.n(vVar);
            default:
                d0Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ e(Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ e(String str, int i7, int i10, p4.q qVar) {
        this.a = 19;
    }

    public /* synthetic */ e(boolean z9, p4.i1 i1Var, Bundle bundle) {
        this.a = 23;
    }
}
