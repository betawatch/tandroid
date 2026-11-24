// default package

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u02 extends n39 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public final /* synthetic */ x02 L;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public final ArrayList h = new ArrayList();
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public u02(x02 x02Var, Context context) {
        this.L = x02Var;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        int i = this.K;
        x02 x02Var = this.L;
        return (x02Var.E3 == null && (x02Var.Z1 instanceof mu1) && !x02Var.B1) ? hq6.d0(x02Var.G3).k1.size() + i : i;
    }

    @Override // w39
    public final int d(int i) {
        if (i < this.K) {
            return (i < this.e || i >= this.f) ? 0 : 1;
        }
        return 1;
    }

    @Override // w39
    public final void f() {
        int i = 0;
        this.K = 0;
        this.d = -1;
        this.n = -1;
        this.s = -1;
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.G = -1;
        this.I = -1;
        this.J = -1;
        this.H = -1;
        this.e = -1;
        this.f = -1;
        this.r = -1;
        x02 x02Var = this.L;
        if (x02Var.B1) {
            this.K = 1;
            this.d = 0;
            int i2 = x02Var.C1;
            if (i2 == 0 || fod.a(i2, 16)) {
                int i3 = this.K;
                this.K = i3 + 1;
                this.n = i3;
            }
            int i4 = this.L.C1;
            if (i4 == 0 || fod.a(i4, TLObject.FLAG_13)) {
                int i5 = this.K;
                this.K = i5 + 1;
                this.G = i5;
            }
            int i6 = this.L.C1;
            if (i6 == 0 || fod.a(i6, TLObject.FLAG_14)) {
                int i7 = this.K;
                this.K = i7 + 1;
                this.H = i7;
            }
            int i8 = this.L.C1;
            if (i8 == 0 || fod.a(i8, 8)) {
                int i9 = this.K;
                this.K = i9 + 1;
                this.s = i9;
            }
            int i10 = this.L.C1;
            if (i10 == 0 || fod.a(i10, 64)) {
                int i11 = this.K;
                this.K = i11 + 1;
                this.F = i11;
            }
            int i12 = this.L.C1;
            if (i12 == 0 || fod.a(i12, 32768)) {
                int i13 = this.K;
                this.K = i13 + 1;
                this.I = i13;
            }
        } else {
            d dVar = x02Var.Z1;
            if (!(dVar instanceof mu1)) {
                this.d = 0;
                this.K = 2;
                this.n = 1;
                if (x02Var.Q1) {
                    this.K = 3;
                    this.s = 2;
                }
            } else if (x02Var.E3 != null) {
                int i14 = x02Var.D3;
                if (i14 == -1) {
                    this.d = 0;
                    this.n = 1;
                    this.K = 3;
                    this.s = 2;
                } else {
                    if (i14 == 0) {
                        this.K = 1;
                        this.d = 0;
                        i = 1;
                    }
                    if (i14 == 1) {
                        int i15 = i + 1;
                        this.K = i15;
                        this.n = i;
                        i = i15;
                    }
                    if (i14 == 2) {
                        this.K = i + 1;
                        this.s = i;
                    }
                }
            } else {
                TLRPC.User h = ((mu1) dVar).h();
                d dVar2 = this.L.Z1;
                TLRPC.Chat chat = dVar2 instanceof mu1 ? ((mu1) dVar2).e : null;
                boolean z = h != null && ((mu1) dVar2).getMessagesController().K1(h.id) > 0;
                int i16 = this.K;
                this.d = i16;
                this.K = i16 + 2;
                this.n = i16 + 1;
                if (na7.q1(this.L.G3).k4.n0.f && ((mu1) this.L.Z1).g4 == 0 && x02.b1(h)) {
                    int i17 = this.K;
                    this.K = i17 + 1;
                    this.r = i17;
                }
                x02 x02Var2 = this.L;
                if (x02Var2.N3) {
                    int i18 = this.K;
                    this.K = i18 + 1;
                    this.F = i18;
                    na7.q1(x02Var2.G3);
                    boolean z2 = w01.a;
                    int i19 = this.K;
                    this.K = i19 + 1;
                    this.J = i19;
                }
                x02 x02Var3 = this.L;
                if (x02Var3.L3) {
                    int i20 = this.K;
                    this.K = i20 + 1;
                    this.w = i20;
                }
                if (x02Var3.N3) {
                    int i21 = this.K;
                    this.K = i21 + 1;
                    this.y = i21;
                }
                int i22 = this.K;
                int i23 = i22 + 1;
                this.K = i23;
                this.s = i22;
                if (x02Var3.M3) {
                    this.K = i22 + 2;
                    this.x = i23;
                }
                d dVar3 = x02Var3.Z1;
                if ((dVar3 instanceof mu1) && ((mu1) dVar3).g4 == 0 && h != null && !z && !h.bot && !ox8.f(x02Var3.G3).b.isEmpty()) {
                    int i24 = this.K;
                    this.K = i24 + 1;
                    this.E = i24;
                }
                x02 x02Var4 = this.L;
                if ((x02Var4.I3 || x02Var4.J3) && !z && (chat == null || !hc2.p0(chat))) {
                    d dVar4 = this.L.Z1;
                    if ((dVar4 instanceof mu1) && !((mu1) dVar4).P7() && !((mu1) this.L.Z1).y()) {
                        mu1 mu1Var = (mu1) this.L.Z1;
                        if (mu1Var.g4 != 5) {
                            this.e = this.K;
                            this.h.clear();
                            ArrayList<TLRPC.TL_attachMenuBot> arrayList = hq6.d0(this.L.G3).b.bots;
                            int size = arrayList.size();
                            while (i < size) {
                                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList.get(i);
                                i++;
                                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                                if (tL_attachMenuBot2.show_in_attach_menu) {
                                    TLObject tLObject = mu1Var.e;
                                    if (tLObject == null) {
                                        tLObject = mu1Var.h();
                                    }
                                    if (hq6.v(tL_attachMenuBot2, tLObject)) {
                                        this.h.add(tL_attachMenuBot2);
                                    }
                                }
                            }
                            int size2 = this.h.size() + this.K;
                            this.K = size2;
                            this.f = size2;
                        }
                    }
                }
            }
        }
        super.f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0237, code lost:
    
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f9, code lost:
    
        if (rr.b(r9, android.os.Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.READ_EXTERNAL_STORAGE") == 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0235, code lost:
    
        if (rr.b(r9, "android.permission.READ_CONTACTS") == 0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02f7  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int i2 = this.L.G3;
        int i3 = s49Var.f;
        View view = s49Var.a;
        boolean z4 = false;
        if (i3 != 0) {
            if (i3 == 1) {
                q02 q02Var = (q02) view;
                q02Var.a.getClass();
                int i4 = this.e;
                if (i >= i4 && i < this.f) {
                    int i5 = i - i4;
                    q02Var.setTag(Integer.valueOf(i5));
                    TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.h.get(i5);
                    TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(tL_attachMenuBot.bot_id));
                    if (V1 != null) {
                        ox4 ox4Var = q02Var.a;
                        ox4Var.getClass();
                        ox4Var.E = null;
                        ox4Var.F = tL_attachMenuBot;
                        ox4Var.P = 0;
                        ox4Var.Q = 0L;
                        ox4Var.a.setText(tL_attachMenuBot.short_name);
                        ox4Var.c.setRoundRadius(0);
                        ox4Var.c.t(gl.L(24.0f), gl.L(24.0f));
                        ox4Var.c.setLayoutParams(nme.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
                        ox4Var.N = true;
                        ox4Var.b(false);
                        ox4Var.a();
                        ox4Var.invalidate();
                        q02Var.b = V1;
                        q02Var.c = tL_attachMenuBot;
                        q02Var.a.f(false, false);
                        q02Var.invalidate();
                        return;
                    }
                    return;
                }
                int i6 = i - this.K;
                q02Var.setTag(Integer.valueOf(i6));
                TLRPC.User V12 = na7.q1(i2).V1(Long.valueOf(((TLRPC.TL_topPeer) hq6.d0(i2).k1.get(i6)).peer.user_id));
                if (V12 == null) {
                    return;
                }
                ox4 ox4Var2 = q02Var.a;
                ox4Var2.E = null;
                ox4Var2.F = null;
                ox4Var2.P = 0;
                ox4Var2.Q = 0L;
                ox4Var2.a.setText(qu2.m(0, V12.first_name, V12.last_name));
                pb0 pb0Var = ox4Var2.V;
                if (pb0Var == null) {
                    pb0Var = new pb0((wjb) null);
                    ox4Var2.V = pb0Var;
                }
                pb0Var.q(V12);
                ox4Var2.c.f(V12, ox4Var2.V);
                ox4Var2.c.t(-1, -1);
                ox4Var2.c.setRoundRadius(gl.L(11.33f));
                ox4Var2.c.setLayoutParams(nme.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
                ox4Var2.c.setColorFilter(null);
                ox4Var2.N = false;
                ox4Var2.invalidate();
                q02Var.b = V12;
                q02Var.c = null;
                q02Var.a.f(false, false);
                q02Var.invalidate();
                return;
            }
            return;
        }
        r02 r02Var = (r02) view;
        r02Var.a.getClass();
        int i7 = this.d;
        Context context = this.c;
        if (i != i7) {
            if (i == this.r) {
                r02Var.a(17, k96.M0(2131742951, null), nx4.O);
                r02Var.setTag(17);
            } else if (i == this.n) {
                r02Var.a(4, k96.M0(2131752228, null), nx4.x);
                r02Var.setTag(4);
                if (Build.VERSION.SDK_INT < 33) {
                }
            } else if (i == this.F) {
                r02Var.a(6, k96.M0(2131752208, null), nx4.E);
                r02Var.setTag(6);
            } else if (i == this.s) {
                r02Var.a(3, k96.M0(2131753949, null), nx4.I);
                r02Var.setTag(3);
            } else if (i == this.w) {
                r02Var.a(9, k96.M0(2131746992, null), nx4.J);
                r02Var.setTag(9);
            } else {
                if (i != this.y) {
                    if (i == this.E) {
                        r02Var.a(11, k96.M0(2131753939, null), nx4.L);
                        r02Var.setTag(11);
                    } else if (i == this.x) {
                        r02Var.a(12, k96.M0(2131743868, null), nx4.s);
                        r02Var.setTag(12);
                    } else if (i == this.G) {
                        r02Var.a(13, k96.M0(2131752197, null), nx4.F);
                        r02Var.setTag(13);
                    } else if (i == this.I) {
                        r02Var.a(15, k96.M0(2131752214, null), nx4.M);
                        r02Var.setTag(15);
                    } else if (i == this.H) {
                        r02Var.a(14, k96.M0(2131752227, null), nx4.G);
                        r02Var.setTag(14);
                    } else if (i == this.J) {
                        r02Var.a(16, k96.M0(2131753980, null), nx4.N);
                        r02Var.setTag(16);
                        z = !na7.q1(i2).d5();
                        z2 = false;
                        r02Var.a.e(z2 ? "!" : null, z2, false);
                        ox4 ox4Var3 = r02Var.a;
                        if (z && !y6c.h(i2).p()) {
                            z4 = true;
                        }
                        ox4Var3.setPremiumBadge(z4);
                    }
                    z2 = false;
                    z = true;
                    r02Var.a.e(z2 ? "!" : null, z2, false);
                    ox4 ox4Var32 = r02Var.a;
                    if (z) {
                        z4 = true;
                    }
                    ox4Var32.setPremiumBadge(z4);
                }
                r02Var.a(5, k96.M0(2131753976, null), nx4.f);
                r02Var.setTag(5);
            }
            z2 = false;
            z = false;
            r02Var.a.e(z2 ? "!" : null, z2, false);
            ox4 ox4Var322 = r02Var.a;
            if (z) {
            }
            ox4Var322.setPremiumBadge(z4);
        }
        r02Var.a(1, k96.M0(2131752226, null), nx4.y);
        r02Var.setTag(1);
        z3 = Build.VERSION.SDK_INT < 33 ? false : false;
        z2 = !z3;
        z = false;
        r02Var.a.e(z2 ? "!" : null, z2, false);
        ox4 ox4Var3222 = r02Var.a;
        if (z) {
        }
        ox4Var3222.setPremiumBadge(z4);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        x02 x02Var = this.L;
        View q02Var = i != 0 ? new q02(x02Var, context) : new r02(x02Var, context);
        q02Var.setImportantForAccessibility(1);
        q02Var.setFocusable(true);
        q02Var.setLayoutParams(new e49(-2, -1));
        return new y29(q02Var);
    }

    @Override // w39
    public final void y(s49 s49Var) {
    }
}
