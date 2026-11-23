package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class z30 extends org.telegram.ui.Components.dk0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final /* synthetic */ f40 N;
    public final Context c;
    public int d;
    public int e;
    public int f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public z30(f40 f40Var, LaunchActivity launchActivity) {
        this.N = f40Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f;
        return (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        f40 f40Var = this.N;
        ArrayList arrayList = f40Var.l2;
        org.telegram.messenger.t3 t3Var = f40Var.V2;
        if (t3Var == null || t3Var.j() || f40Var.n2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.G = 0;
        this.M = f40Var.V2.d.h(org.telegram.messenger.gj.B1(f40Var.v2)) >= 0;
        if (f40Var.s1()) {
            int i7 = this.G;
            this.G = i7 + 1;
            this.L = i7;
        }
        int i10 = this.G;
        this.H = i10;
        int size = arrayList.size() + i10;
        this.G = size;
        this.I = size;
        if (arrayList.size() > 0) {
            int i11 = this.G;
            this.G = i11 + 1;
            this.J = i11;
        }
        if (!arrayList.isEmpty() && f40Var.T0() && f40Var.V2.b.participants_count > org.telegram.messenger.np.u1(f40Var.o1.a).c4) {
            int i12 = this.G;
            this.G = i12 + 1;
            this.K = i12;
        }
        this.d = this.G;
        if (!f40Var.v1()) {
            this.G = f40Var.V2.g.size() + this.G;
        }
        this.e = this.G;
        if (f40Var.V2.j.isEmpty() || f40Var.v1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i13 = this.G;
            this.f = i13;
            int size2 = f40Var.V2.j.size() + i13;
            this.G = size2;
            this.h = size2;
        }
        if (f40Var.V2.m.isEmpty() || f40Var.v1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i14 = this.G;
            this.n = i14;
            int size3 = f40Var.V2.m.size() + i14;
            this.G = size3;
            this.r = size3;
        }
        if (f40Var.V2.l.isEmpty() || f40Var.v1()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i15 = this.G;
            this.s = i15;
            int size4 = f40Var.V2.l.size() + i15;
            this.G = size4;
            this.w = size4;
        }
        if (f40Var.s1()) {
            int i16 = this.G;
            this.y = i16;
            this.G = i16 + 2;
            this.E = i16 + 1;
        } else if (!f40Var.v1() && (((!org.telegram.messenger.v3.T(f40Var.U2) || ((chat2 = f40Var.U2) != null && chat2.megagroup)) && org.telegram.messenger.v3.B(f40Var.U2)) || (org.telegram.messenger.v3.T(f40Var.U2) && (chat = f40Var.U2) != null && !chat.megagroup && org.telegram.messenger.v3.t0(chat)))) {
            int i17 = this.G;
            this.G = i17 + 1;
            this.x = i17;
        }
        int i18 = this.G;
        this.G = i18 + 1;
        this.F = i18;
    }

    @Override // v4.i0
    public final int b() {
        return this.G;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == this.F) {
            return 3;
        }
        if (i7 == this.x || i7 == this.y || i7 == this.E) {
            return 0;
        }
        if (i7 == this.J) {
            return 5;
        }
        if (i7 >= this.d && i7 < this.e) {
            return 1;
        }
        if (i7 >= this.H && i7 < this.I) {
            return 4;
        }
        if (i7 == this.K) {
            return 6;
        }
        return i7 == this.L ? 7 : 2;
    }

    @Override // v4.i0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.i0
    public final void g(int i7) {
        E();
        super.g(i7);
    }

    @Override // v4.i0
    public final void j(int i7, int i10) {
        E();
        super.j(i7, i10);
    }

    @Override // v4.i0
    public final void k(int i7, int i10) {
        E();
        super.k(i7, i10);
    }

    @Override // v4.i0
    public final void n(int i7, int i10, Object obj) {
        E();
        super.n(i7, i10, obj);
    }

    @Override // v4.i0
    public final void o(int i7, int i10) {
        E();
        super.o(i7, i10);
    }

    @Override // v4.i0
    public final void p(int i7, int i10) {
        E();
        super.p(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // v4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        o30 o30Var;
        Long l10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.messenger.u3 u3Var;
        o30 o30Var2;
        f40 f40Var = this.N;
        ArrayList arrayList = f40Var.y2;
        ArrayList arrayList2 = f40Var.A2;
        ArrayList arrayList3 = f40Var.l2;
        ArrayList arrayList4 = f40Var.z2;
        int i10 = f1Var.f;
        View view = f1Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.a4 a4Var = (org.telegram.ui.Cells.a4) view;
            if (i7 == this.y) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, f40Var.J0);
                a4Var.a(w02, w02);
                a4Var.b(R.drawable.msg_contact_add, org.telegram.messenger.hd.N0(2131743180, null), true);
                return;
            } else {
                if (i7 == this.E) {
                    int w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.v6, f40Var.J0);
                    a4Var.a(w03, w03);
                    a4Var.b(R.drawable.msg_link2, org.telegram.messenger.hd.N0(2131743175, null), false);
                    return;
                }
                int S0 = org.telegram.messenger.g0.S0(f40Var.J1.getTag() != null ? 1.0f : 0.0f, 1.0f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.ch, false), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.fh, false));
                a4Var.a(S0, S0);
                if (!org.telegram.messenger.v3.T(f40Var.U2) || (chat = f40Var.U2) == null || chat.megagroup || !org.telegram.messenger.v3.t0(chat)) {
                    a4Var.b(R.drawable.msg_contact_add, org.telegram.messenger.hd.N0(2131743128, null), false);
                    return;
                } else {
                    a4Var.b(R.drawable.msg_link, org.telegram.messenger.hd.N0(2131743091, null), false);
                    return;
                }
            }
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            int i11 = i7 - this.d;
            if (f40Var.n2) {
                if (i11 >= 0 && i11 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            } else {
                if (i11 >= 0 && i11 < f40Var.V2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) f40Var.V2.g.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            }
            if (groupCallParticipant2 != null) {
                long B1 = org.telegram.messenger.gj.B1(groupCallParticipant2.peer);
                long B12 = org.telegram.messenger.gj.B1(f40Var.v2);
                if (B1 == B12 && (o30Var = f40Var.h4) != null) {
                    fileLocation = o30Var.c;
                }
                TLRPC.FileLocation fileLocation2 = fileLocation;
                float f10 = fileLocation2 != null ? f40Var.h4.a : 1.0f;
                boolean z13 = g4Var.getParticipant() != null && org.telegram.messenger.gj.B1(g4Var.getParticipant().peer) == B1;
                g4Var.e(f40Var.o1, groupCallParticipant2, f40Var.V2, B12, fileLocation2, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.c4 c4Var = g4Var.y;
                c4Var.setProgress(f10);
                if (f10 < 1.0f) {
                    org.telegram.messenger.g0.X3(c4Var, true, 1.0f, true, z14);
                    return;
                } else {
                    org.telegram.messenger.g0.X3(c4Var, false, 1.0f, true, z14);
                    return;
                }
            }
            return;
        }
        if (i10 != 2) {
            if (i10 != 4) {
                return;
            }
            org.telegram.ui.Components.voip.r rVar = (org.telegram.ui.Components.voip.r) view;
            org.telegram.messenger.u3 participant = rVar.getParticipant();
            int i12 = i7 - this.H;
            rVar.a = f40Var.n1.i(i7);
            if (f40Var.n2) {
                if (i12 >= 0 && i12 < arrayList4.size()) {
                    u3Var = (org.telegram.messenger.u3) arrayList4.get(i12);
                }
                u3Var = null;
            } else {
                if (i12 >= 0 && i12 < arrayList3.size()) {
                    u3Var = (org.telegram.messenger.u3) arrayList3.get(i12);
                }
                u3Var = null;
            }
            if (u3Var != null) {
                if (org.telegram.messenger.gj.B1(u3Var.a.peer) == org.telegram.messenger.gj.B1(f40Var.v2) && (o30Var2 = f40Var.h4) != null) {
                    fileLocation = o30Var2.c;
                }
                if (fileLocation != null) {
                    float f11 = f40Var.h4.a;
                }
                if (rVar.getParticipant() != null) {
                    rVar.getParticipant().equals(u3Var);
                }
                rVar.d = u3Var;
            }
            if (participant == null || participant.equals(u3Var) || !rVar.e || rVar.getRenderer() == null) {
                return;
            }
            f40.K0(f40Var, rVar, false);
            f40.K0(f40Var, rVar, true);
            return;
        }
        org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
        int i13 = i7 - this.f;
        int i14 = i7 - this.n;
        if (i14 < 0 || i14 >= f40Var.V2.m.size()) {
            int i15 = i7 - this.s;
            if (i15 < 0 || i15 >= f40Var.V2.l.size()) {
                if (f40Var.n2) {
                    if (i13 >= 0 && i13 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i13);
                        z11 = false;
                        z12 = false;
                    }
                } else if (i13 >= 0 && i13 < f40Var.V2.j.size()) {
                    l10 = (Long) f40Var.V2.j.get(i13);
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) f40Var.V2.k.get(l10);
                    z10 = s3Var != null && s3Var.a();
                    z11 = false;
                    z12 = false;
                }
                z11 = false;
                z12 = false;
                z10 = false;
                l10 = null;
            } else {
                l10 = (Long) f40Var.V2.l.get(i7 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l10 == null) {
                int i16 = f40Var.a;
                org.telegram.ui.ActionBar.m5 m5Var = z3Var.c;
                org.telegram.ui.ActionBar.m5 m5Var2 = z3Var.b;
                org.telegram.ui.Components.q9 q9Var = z3Var.a;
                org.telegram.ui.Components.b9 b9Var = z3Var.e;
                TLRPC.User c22 = org.telegram.messenger.np.u1(i16).c2(l10);
                z3Var.f = c22;
                if (c22 == null) {
                    b9Var.g(21);
                } else {
                    b9Var.r(c22);
                }
                m5Var2.l(org.telegram.messenger.p10.q(z3Var.f), false);
                q9Var.getImageReceiver().d = i16;
                q9Var.f(z3Var.f, b9Var);
                m5Var.l(org.telegram.messenger.hd.N0(z12 ? 2131745267 : z11 ? 2131745268 : z10 ? 2131751812 : 2131748912, null), false);
                float f12 = 0.5f;
                q9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                m5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f12 = 1.0f;
                }
                m5Var.setAlpha(f12);
                ImageView imageView = z3Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l10 = (Long) f40Var.V2.m.get(i7 - this.n);
        z11 = true;
        z12 = false;
        z10 = z12;
        if (l10 == null) {
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View view;
        f40 f40Var = this.N;
        org.telegram.messenger.c cVar = f40Var.o1;
        Context context = this.c;
        if (i7 == 0) {
            v30 v30Var = new v30(context);
            v30Var.h = 67;
            v30Var.n = 18;
            Paint paint = new Paint();
            v30Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
            v30Var.e = 23;
            org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
            v30Var.a = m5Var;
            org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.G6, null);
            m5Var.setTextSize(16);
            m5Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            m5Var.setImportantForAccessibility(2);
            v30Var.addView(m5Var);
            org.telegram.ui.ActionBar.m5 m5Var2 = new org.telegram.ui.ActionBar.m5(context);
            v30Var.b = m5Var2;
            org.telegram.ui.ActionBar.t6.X(m5Var2, org.telegram.ui.ActionBar.m6.I6, null);
            m5Var2.setTextSize(16);
            m5Var2.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
            m5Var2.setImportantForAccessibility(2);
            v30Var.addView(m5Var2);
            ImageView imageView = new ImageView(context);
            v30Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.m6, null, PorterDuff.Mode.MULTIPLY);
            v30Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            v30Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            v30Var.addView(imageView2);
            v30Var.setFocusable(true);
            view = v30Var;
        } else if (i7 == 1) {
            view = new w30(this, context);
        } else if (i7 == 2) {
            x30 x30Var = new x30(context);
            x30Var.n = org.telegram.ui.ActionBar.m6.ih;
            Paint paint2 = new Paint();
            x30Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Xg, false));
            x30Var.e = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
            x30Var.a = q9Var;
            q9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            boolean z10 = org.telegram.messenger.hd.a0;
            x30Var.addView(q9Var, c8.ma.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.m5 m5Var3 = new org.telegram.ui.ActionBar.m5(context);
            x30Var.b = m5Var3;
            org.telegram.ui.ActionBar.t6.X(m5Var3, org.telegram.ui.ActionBar.m6.eh, null);
            m5Var3.setTypeface(org.telegram.messenger.g0.o());
            m5Var3.setTextSize(16);
            m5Var3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            boolean z11 = org.telegram.messenger.hd.a0;
            x30Var.addView(m5Var3, c8.ma.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.m5 m5Var4 = new org.telegram.ui.ActionBar.m5(context);
            x30Var.c = m5Var4;
            m5Var4.setTextSize(15);
            m5Var4.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            m5Var4.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, x30Var.n, false));
            m5Var4.l(org.telegram.messenger.hd.N0(2131748912, null), false);
            boolean z12 = org.telegram.messenger.hd.a0;
            x30Var.addView(m5Var4, c8.ma.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            x30Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, x30Var.n, false), PorterDuff.Mode.MULTIPLY));
            x30Var.addView(imageView3, c8.ma.d(48, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            x30Var.setWillNotDraw(false);
            x30Var.setFocusable(true);
            view = x30Var;
        } else if (i7 == 4) {
            view = new y30(this, context);
        } else if (i7 == 5) {
            view = new org.telegram.ui.Components.ln(context, 14);
        } else if (i7 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
            if (org.telegram.messenger.v3.W(f40Var.U2)) {
                textView.setText(org.telegram.messenger.hd.a0(null, null, 2131743204, org.telegram.messenger.hd.G(org.telegram.messenger.np.u1(cVar.a).c4, "Participants", new Object[0])));
                view = textView;
            } else {
                textView.setText(org.telegram.messenger.hd.a0(null, null, 2131742980, org.telegram.messenger.hd.G(org.telegram.messenger.np.u1(cVar.a).c4, "Members", new Object[0])));
                view = textView;
            }
        } else if (i7 != 7) {
            view = new View(context);
        } else {
            if (f40Var.k2 == null) {
                f40Var.k2 = new g.b();
            }
            view = new uv(context, f40Var.k2);
        }
        return i5.c.q(view, view, -1, -2);
    }

    @Override // v4.i0
    public final void y(v4.f1 f1Var) {
        d30 d30Var = this.N.J1;
        int i7 = f1Var.f;
        View view = f1Var.a;
        if (i7 == 1) {
            org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) view;
            int i10 = d30Var.getTag() != null ? org.telegram.ui.ActionBar.m6.ih : org.telegram.ui.ActionBar.m6.dh;
            g4Var.f(i10, org.telegram.ui.ActionBar.m6.x0(null, i10, false));
            g4Var.setDrawDivider(f1Var.b() != this.G - 2);
            return;
        }
        if (i7 == 2) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            int i11 = d30Var.getTag() != null ? org.telegram.ui.ActionBar.m6.ih : org.telegram.ui.ActionBar.m6.dh;
            z3Var.a(i11, org.telegram.ui.ActionBar.m6.x0(null, i11, false));
            z3Var.setDrawDivider(f1Var.b() != this.G - 2);
        }
    }
}
