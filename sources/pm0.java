// default package

import android.graphics.Color;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pm0 extends nm0 {
    public final /* synthetic */ ylb s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm0(ylb ylbVar, ylb ylbVar2) {
        super(ylbVar);
        this.s = ylbVar2;
    }

    @Override // nm0, am0
    public final int V() {
        int a = a(this.c);
        ylb ylbVar = this.s;
        if (!cmb.g1(ylbVar) || Color.alpha(cmb.v0(cmb.va, ylbVar)) == 0) {
            return a;
        }
        return 0;
    }

    @Override // nm0
    public final float b() {
        return cmb.g1(this.s) ? gm.N(1.0f) : this.r;
    }

    @Override // nm0
    public final float c() {
        return cmb.g1(this.s) ? gm.N(2.25f) : this.n;
    }

    @Override // nm0, am0
    public final int g0() {
        ylb ylbVar = this.s;
        if (cmb.g1(ylbVar)) {
            return cmb.v0(cmb.va, ylbVar);
        }
        return 0;
    }

    @Override // nm0, am0
    public final float g1() {
        return gm.N(0.6f);
    }

    @Override // nm0, am0
    public final int h1() {
        ylb ylbVar = this.s;
        if (cmb.g1(ylbVar)) {
            return cmb.v0(cmb.xa, ylbVar);
        }
        return 0;
    }

    @Override // nm0, am0
    public final int r1() {
        ylb ylbVar = this.s;
        return cmb.g1(ylbVar) ? cmb.v0(cmb.wa, ylbVar) : a(this.b);
    }

    @Override // nm0, am0
    public final int u0() {
        int a = a(this.d);
        ylb ylbVar = this.s;
        if (!cmb.g1(ylbVar) || Color.alpha(cmb.v0(cmb.va, ylbVar)) == 0) {
            return a;
        }
        return 0;
    }
}
