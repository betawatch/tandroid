package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;
import p4.a1;
import p4.g1;
import p4.i1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements p4.c0, a1, h2.j {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override // h2.j
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        switch (this.a) {
            case 19:
                g1Var.B0();
                break;
            case 20:
                g1Var.b();
                break;
            case 21:
                g1Var.g0();
                break;
            case 22:
            case 27:
            default:
                g1Var.H0();
                break;
            case 23:
                g1Var.C0();
                break;
            case 24:
                g1Var.L0();
                break;
            case 25:
                g1Var.U();
                break;
            case 26:
                g1Var.E();
                break;
            case 28:
                g1Var.J0();
                break;
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        switch (this.a) {
            case 14:
                uVar.getClass();
                break;
            case 15:
                uVar.c(i7);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // p4.a1
    public Object i(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 17:
                d0Var.getClass();
                throw new ClassCastException();
            case 18:
                d0Var.getClass();
                throw new ClassCastException();
            case 22:
                return d0Var.n(vVar);
            default:
                d0Var.getClass();
                throw new ClassCastException();
        }
    }

    public /* synthetic */ a(Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ a(String str, int i7, int i10, p4.q qVar) {
        this.a = 18;
    }

    public /* synthetic */ a(boolean z9, i1 i1Var, Bundle bundle) {
        this.a = 22;
    }
}
