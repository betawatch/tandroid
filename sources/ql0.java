// default package

import android.graphics.Color;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ql0 extends ol0 {
    public final /* synthetic */ vnb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql0(vnb vnbVar, vnb vnbVar2) {
        super(vnbVar);
        this.s = vnbVar2;
    }

    @Override // ol0, bl0
    public final int X() {
        int a = a(this.c);
        vnb vnbVar = this.s;
        if (!aob.g1(vnbVar) || Color.alpha(aob.v0(aob.wa, vnbVar)) == 0) {
            return a;
        }
        return 0;
    }

    @Override // ol0
    public final float b() {
        return aob.g1(this.s) ? hl.N(1.0f) : this.r;
    }

    @Override // ol0
    public final float c() {
        return aob.g1(this.s) ? hl.N(2.25f) : this.n;
    }

    @Override // ol0, bl0
    public final int m0() {
        vnb vnbVar = this.s;
        if (aob.g1(vnbVar)) {
            return aob.v0(aob.wa, vnbVar);
        }
        return 0;
    }

    @Override // ol0, bl0
    public final float m1() {
        return hl.N(0.6f);
    }

    @Override // ol0, bl0
    public final int o1() {
        vnb vnbVar = this.s;
        if (aob.g1(vnbVar)) {
            return aob.v0(aob.ya, vnbVar);
        }
        return 0;
    }

    @Override // ol0, bl0
    public final int x0() {
        int a = a(this.d);
        vnb vnbVar = this.s;
        if (!aob.g1(vnbVar) || Color.alpha(aob.v0(aob.wa, vnbVar)) == 0) {
            return a;
        }
        return 0;
    }

    @Override // ol0, bl0
    public final int x1() {
        vnb vnbVar = this.s;
        return aob.g1(vnbVar) ? aob.v0(aob.xa, vnbVar) : a(this.b);
    }
}
