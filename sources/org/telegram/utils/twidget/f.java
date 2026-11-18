package org.telegram.utils.twidget;

import android.media.AudioRecordingConfiguration;
import android.os.Bundle;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements p4.c0, p4.c1, h2.j {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i7) {
        this.a = i7;
    }

    public static /* bridge */ /* synthetic */ AudioRecordingConfiguration a(Object obj) {
        return (AudioRecordingConfiguration) obj;
    }

    @Override // h2.j
    public void accept(Object obj) {
        p4.i1 i1Var = (p4.i1) obj;
        switch (this.a) {
            case 26:
                i1Var.B0();
                break;
            case 27:
                i1Var.b();
                break;
            default:
                i1Var.g0();
                break;
        }
    }

    @Override // p4.c0
    public void b(p4.u uVar, int i7) {
        switch (this.a) {
            case 21:
                uVar.getClass();
                break;
            case 22:
                uVar.c(i7);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // p4.c1
    public Object k(p4.d0 d0Var, p4.v vVar, int i7) {
        switch (this.a) {
            case 24:
                d0Var.getClass();
                throw new ClassCastException();
            case 25:
                d0Var.getClass();
                throw new ClassCastException();
            default:
                return d0Var.n(vVar);
        }
    }

    public /* synthetic */ f(Object obj, int i7) {
        this.a = i7;
    }

    public /* synthetic */ f(String str, int i7, int i10, p4.q qVar) {
        this.a = 25;
    }

    public /* synthetic */ f(boolean z10, p4.k1 k1Var, Bundle bundle) {
        this.a = 29;
    }
}
