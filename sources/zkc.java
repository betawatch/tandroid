// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class zkc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ glc b;
    public final /* synthetic */ String[] c;

    public /* synthetic */ zkc(glc glcVar, String[] strArr, byte b) {
        this.a = b;
        this.b = glcVar;
        this.c = strArr;
    }

    @Override // qac
    public final void a(Object obj) {
        vo3 vo3Var;
        jlc jlcVar;
        vo3 vo3Var2;
        byte b = this.a;
        boolean z = false;
        String[] strArr = this.c;
        glc glcVar = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                glcVar.getClass();
                if (num.intValue() != 0) {
                    String str = strArr[num.intValue() - 1];
                    gn3 L = DictationAsr.L(str);
                    boolean z2 = (L == null || DictationAsr.y(L)) ? false : true;
                    DictationAsr.Z(str);
                    DictationAsr.s(L);
                    if (z2 && glcVar.c == 2 && (jlcVar = glcVar.h) != null) {
                        glcVar.n = "";
                        if (jlcVar.P1) {
                            jlcVar.x1 = null;
                        }
                        jlcVar.k0 = "";
                        jlcVar.y1 = -1;
                        jlcVar.l0 = null;
                        jlcVar.o0.clear();
                        jlcVar.U0 = true;
                        jlcVar.D0 = 0.0f;
                        jlcVar.C0 = 0.0f;
                        jlcVar.E0 = 0.0f;
                        jlcVar.F0 = 0.0f;
                        jlcVar.H0 = -1.0f;
                        jlcVar.G0 = -1.0f;
                        jlcVar.J0 = -1.0f;
                        jlcVar.L0 = false;
                        jlcVar.S0 = 0L;
                        jlcVar.T0 = 0.0f;
                        jlcVar.A0 = true;
                        jlcVar.Z0 = true;
                        jlcVar.invalidate();
                    }
                    jlc jlcVar2 = glcVar.h;
                    if (jlcVar2 != null) {
                        jlcVar2.setLanguage(un3.H(str));
                    }
                    if (glcVar.c == 2 && (vo3Var = glcVar.f) != null) {
                        vo3Var.j(str);
                    }
                    glcVar.u();
                    break;
                } else {
                    DictationAsr.a0(true);
                    break;
                }
            default:
                if (num.intValue() != 0) {
                    String str2 = strArr[num.intValue() - 1];
                    gn3 L2 = DictationAsr.L(str2);
                    if (L2 != null && !DictationAsr.y(L2)) {
                        z = true;
                    }
                    DictationAsr.Z(str2);
                    DictationAsr.s(L2);
                    if (z && glcVar.c == 2 && glcVar.X == null && glcVar.e0 == null) {
                        glcVar.M.clear();
                        glcVar.p();
                    }
                    String H = un3.H(str2);
                    glcVar.l0 = H;
                    ykc ykcVar = glcVar.K;
                    if (ykcVar != null) {
                        ykcVar.setLanguage(H);
                    }
                    if (glcVar.c == 2 && (vo3Var2 = glcVar.f) != null) {
                        vo3Var2.j(str2);
                    }
                    glcVar.u();
                    break;
                } else {
                    DictationAsr.a0(true);
                    break;
                }
                break;
        }
    }
}
