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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class w30 extends org.telegram.ui.Components.tj0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final /* synthetic */ c40 N;
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

    public w30(c40 c40Var, LaunchActivity launchActivity) {
        this.N = c40Var;
        this.c = launchActivity;
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f;
        return (i7 == 3 || i7 == 4 || i7 == 5 || i7 == 6) ? false : true;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        c40 c40Var = this.N;
        ArrayList arrayList = c40Var.l2;
        org.telegram.messenger.r3 r3Var = c40Var.V2;
        if (r3Var == null || r3Var.j() || c40Var.n2) {
            return;
        }
        this.x = -1;
        this.y = -1;
        this.E = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.G = 0;
        this.M = c40Var.V2.d.h(org.telegram.messenger.gj.B1(c40Var.v2)) >= 0;
        if (c40Var.r1()) {
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
        if (!arrayList.isEmpty() && c40Var.S0() && c40Var.V2.b.participants_count > org.telegram.messenger.np.s1(c40Var.o1.a).a4) {
            int i12 = this.G;
            this.G = i12 + 1;
            this.K = i12;
        }
        this.d = this.G;
        if (!c40Var.u1()) {
            this.G = c40Var.V2.g.size() + this.G;
        }
        this.e = this.G;
        if (c40Var.V2.j.isEmpty() || c40Var.u1()) {
            this.f = -1;
            this.h = -1;
        } else {
            int i13 = this.G;
            this.f = i13;
            int size2 = c40Var.V2.j.size() + i13;
            this.G = size2;
            this.h = size2;
        }
        if (c40Var.V2.m.isEmpty() || c40Var.u1()) {
            this.n = -1;
            this.r = -1;
        } else {
            int i14 = this.G;
            this.n = i14;
            int size3 = c40Var.V2.m.size() + i14;
            this.G = size3;
            this.r = size3;
        }
        if (c40Var.V2.l.isEmpty() || c40Var.u1()) {
            this.s = -1;
            this.w = -1;
        } else {
            int i15 = this.G;
            this.s = i15;
            int size4 = c40Var.V2.l.size() + i15;
            this.G = size4;
            this.w = size4;
        }
        if (c40Var.r1()) {
            int i16 = this.G;
            this.y = i16;
            this.G = i16 + 2;
            this.E = i16 + 1;
        } else if (!c40Var.u1() && (((!org.telegram.messenger.t3.T(c40Var.U2) || ((chat2 = c40Var.U2) != null && chat2.megagroup)) && org.telegram.messenger.t3.B(c40Var.U2)) || (org.telegram.messenger.t3.T(c40Var.U2) && (chat = c40Var.U2) != null && !chat.megagroup && org.telegram.messenger.t3.t0(chat)))) {
            int i17 = this.G;
            this.G = i17 + 1;
            this.x = i17;
        }
        int i18 = this.G;
        this.G = i18 + 1;
        this.F = i18;
    }

    @Override // v4.h0
    public final int b() {
        return this.G;
    }

    @Override // v4.h0
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

    @Override // v4.h0
    public final void f() {
        E();
        super.f();
    }

    @Override // v4.h0
    public final void g(int i7) {
        E();
        super.g(i7);
    }

    @Override // v4.h0
    public final void j(int i7, int i10) {
        E();
        super.j(i7, i10);
    }

    @Override // v4.h0
    public final void k(int i7, int i10) {
        E();
        super.k(i7, i10);
    }

    @Override // v4.h0
    public final void n(int i7, int i10, Object obj) {
        E();
        super.n(i7, i10, obj);
    }

    @Override // v4.h0
    public final void o(int i7, int i10) {
        E();
        super.o(i7, i10);
    }

    @Override // v4.h0
    public final void p(int i7, int i10) {
        E();
        super.p(i7, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    @Override // v4.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(v4.e1 e1Var, int i7) {
        TLRPC.Chat chat;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.GroupCallParticipant groupCallParticipant2;
        l30 l30Var;
        Long l10;
        boolean z10;
        boolean z11;
        boolean z12;
        org.telegram.messenger.s3 s3Var;
        l30 l30Var2;
        c40 c40Var = this.N;
        ArrayList arrayList = c40Var.y2;
        ArrayList arrayList2 = c40Var.A2;
        ArrayList arrayList3 = c40Var.l2;
        ArrayList arrayList4 = c40Var.z2;
        int i10 = e1Var.f;
        View view = e1Var.a;
        TLRPC.FileLocation fileLocation = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (i7 == this.y) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v6, c40Var.J0);
                z3Var.a(w02, w02);
                z3Var.b(R.drawable.msg_contact_add, org.telegram.messenger.hd.M0(2131743425, null), true);
                return;
            } else {
                if (i7 == this.E) {
                    int w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.v6, c40Var.J0);
                    z3Var.a(w03, w03);
                    z3Var.b(R.drawable.msg_link2, org.telegram.messenger.hd.M0(2131743420, null), false);
                    return;
                }
                int S0 = org.telegram.messenger.g0.S0(c40Var.J1.getTag() != null ? 1.0f : 0.0f, 1.0f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.ch, false), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.fh, false));
                z3Var.a(S0, S0);
                if (!org.telegram.messenger.t3.T(c40Var.U2) || (chat = c40Var.U2) == null || chat.megagroup || !org.telegram.messenger.t3.t0(chat)) {
                    z3Var.b(R.drawable.msg_contact_add, org.telegram.messenger.hd.M0(2131743373, null), false);
                    return;
                } else {
                    z3Var.b(R.drawable.msg_link, org.telegram.messenger.hd.M0(2131743336, null), false);
                    return;
                }
            }
        }
        if (i10 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i11 = i7 - this.d;
            if (c40Var.n2) {
                if (i11 >= 0 && i11 < arrayList.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) arrayList.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            } else {
                if (i11 >= 0 && i11 < c40Var.V2.g.size()) {
                    groupCallParticipant = (TLRPC.GroupCallParticipant) c40Var.V2.g.get(i11);
                    groupCallParticipant2 = groupCallParticipant;
                }
                groupCallParticipant2 = null;
            }
            if (groupCallParticipant2 != null) {
                long B1 = org.telegram.messenger.gj.B1(groupCallParticipant2.peer);
                long B12 = org.telegram.messenger.gj.B1(c40Var.v2);
                if (B1 == B12 && (l30Var = c40Var.h4) != null) {
                    fileLocation = l30Var.c;
                }
                TLRPC.FileLocation fileLocation2 = fileLocation;
                float f10 = fileLocation2 != null ? c40Var.h4.a : 1.0f;
                boolean z13 = f4Var.getParticipant() != null && org.telegram.messenger.gj.B1(f4Var.getParticipant().peer) == B1;
                f4Var.e(c40Var.o1, groupCallParticipant2, c40Var.V2, B12, fileLocation2, z13);
                boolean z14 = z13;
                org.telegram.ui.Cells.b4 b4Var = f4Var.y;
                b4Var.setProgress(f10);
                if (f10 < 1.0f) {
                    org.telegram.messenger.g0.Y3(b4Var, true, 1.0f, true, z14);
                    return;
                } else {
                    org.telegram.messenger.g0.Y3(b4Var, false, 1.0f, true, z14);
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
            org.telegram.messenger.s3 participant = rVar.getParticipant();
            int i12 = i7 - this.H;
            rVar.a = c40Var.n1.i(i7);
            if (c40Var.n2) {
                if (i12 >= 0 && i12 < arrayList4.size()) {
                    s3Var = (org.telegram.messenger.s3) arrayList4.get(i12);
                }
                s3Var = null;
            } else {
                if (i12 >= 0 && i12 < arrayList3.size()) {
                    s3Var = (org.telegram.messenger.s3) arrayList3.get(i12);
                }
                s3Var = null;
            }
            if (s3Var != null) {
                if (org.telegram.messenger.gj.B1(s3Var.a.peer) == org.telegram.messenger.gj.B1(c40Var.v2) && (l30Var2 = c40Var.h4) != null) {
                    fileLocation = l30Var2.c;
                }
                if (fileLocation != null) {
                    float f11 = c40Var.h4.a;
                }
                if (rVar.getParticipant() != null) {
                    rVar.getParticipant().equals(s3Var);
                }
                rVar.d = s3Var;
            }
            if (participant == null || participant.equals(s3Var) || !rVar.e || rVar.getRenderer() == null) {
                return;
            }
            c40.J0(c40Var, rVar, false);
            c40.J0(c40Var, rVar, true);
            return;
        }
        org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
        int i13 = i7 - this.f;
        int i14 = i7 - this.n;
        if (i14 < 0 || i14 >= c40Var.V2.m.size()) {
            int i15 = i7 - this.s;
            if (i15 < 0 || i15 >= c40Var.V2.l.size()) {
                if (c40Var.n2) {
                    if (i13 >= 0 && i13 < arrayList2.size()) {
                        l10 = (Long) arrayList2.get(i13);
                        z11 = false;
                        z12 = false;
                    }
                } else if (i13 >= 0 && i13 < c40Var.V2.j.size()) {
                    l10 = (Long) c40Var.V2.j.get(i13);
                    org.telegram.messenger.q3 q3Var = (org.telegram.messenger.q3) c40Var.V2.k.get(l10);
                    z10 = q3Var != null && q3Var.a();
                    z11 = false;
                    z12 = false;
                }
                z11 = false;
                z12 = false;
                z10 = false;
                l10 = null;
            } else {
                l10 = (Long) c40Var.V2.l.get(i7 - this.s);
                z12 = true;
                z11 = false;
                z10 = false;
            }
            if (l10 == null) {
                int i16 = c40Var.a;
                org.telegram.ui.ActionBar.j5 j5Var = y3Var.c;
                org.telegram.ui.ActionBar.j5 j5Var2 = y3Var.b;
                org.telegram.ui.Components.i9 i9Var = y3Var.a;
                org.telegram.ui.Components.t8 t8Var = y3Var.e;
                TLRPC.User a22 = org.telegram.messenger.np.s1(i16).a2(l10);
                y3Var.f = a22;
                if (a22 == null) {
                    t8Var.g(21);
                } else {
                    t8Var.r(a22);
                }
                j5Var2.l(org.telegram.messenger.q10.p(y3Var.f), false);
                i9Var.getImageReceiver().d = i16;
                i9Var.f(y3Var.f, t8Var);
                j5Var.l(org.telegram.messenger.hd.M0(z12 ? 2131745463 : z11 ? 2131745464 : z10 ? 2131751824 : 2131749105, null), false);
                float f12 = 0.5f;
                i9Var.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                j5Var2.setAlpha((z11 || z12) ? 0.5f : 1.0f);
                if (!z11 && !z12) {
                    f12 = 1.0f;
                }
                j5Var.setAlpha(f12);
                ImageView imageView = y3Var.d;
                if (!z11 && !z12) {
                    r9 = 1.0f;
                }
                imageView.setAlpha(r9);
                return;
            }
            return;
        }
        l10 = (Long) c40Var.V2.m.get(i7 - this.n);
        z11 = true;
        z12 = false;
        z10 = z12;
        if (l10 == null) {
        }
    }

    @Override // v4.h0
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        View view;
        c40 c40Var = this.N;
        org.telegram.messenger.c cVar = c40Var.o1;
        Context context = this.c;
        if (i7 == 0) {
            s30 s30Var = new s30(context);
            s30Var.h = 67;
            s30Var.n = 18;
            Paint paint = new Paint();
            s30Var.r = paint;
            paint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
            s30Var.e = 23;
            org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
            s30Var.a = j5Var;
            org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.G6, null);
            j5Var.setTextSize(16);
            j5Var.setGravity(org.telegram.messenger.hd.a0 ? 5 : 3);
            j5Var.setImportantForAccessibility(2);
            s30Var.addView(j5Var);
            org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
            s30Var.b = j5Var2;
            org.telegram.ui.ActionBar.q6.X(j5Var2, org.telegram.ui.ActionBar.j6.I6, null);
            j5Var2.setTextSize(16);
            j5Var2.setGravity(org.telegram.messenger.hd.a0 ? 3 : 5);
            j5Var2.setImportantForAccessibility(2);
            s30Var.addView(j5Var2);
            ImageView imageView = new ImageView(context);
            s30Var.c = imageView;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.m6, null, PorterDuff.Mode.MULTIPLY);
            s30Var.addView(imageView);
            ImageView imageView2 = new ImageView(context);
            s30Var.d = imageView2;
            imageView2.setScaleType(scaleType);
            s30Var.addView(imageView2);
            s30Var.setFocusable(true);
            view = s30Var;
        } else if (i7 == 1) {
            view = new t30(this, context);
        } else if (i7 == 2) {
            u30 u30Var = new u30(context);
            u30Var.n = org.telegram.ui.ActionBar.j6.ih;
            Paint paint2 = new Paint();
            u30Var.h = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Xg, false));
            u30Var.e = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
            u30Var.a = i9Var;
            i9Var.setRoundRadius(org.telegram.messenger.g0.L(24.0f));
            boolean z10 = org.telegram.messenger.hd.a0;
            u30Var.addView(i9Var, c8.ja.d(46, 46.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 11.0f, 6.0f, z10 ? 11.0f : 0.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
            u30Var.b = j5Var3;
            org.telegram.ui.ActionBar.q6.X(j5Var3, org.telegram.ui.ActionBar.j6.eh, null);
            j5Var3.setTypeface(org.telegram.messenger.g0.o());
            j5Var3.setTextSize(16);
            j5Var3.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            boolean z11 = org.telegram.messenger.hd.a0;
            u30Var.addView(j5Var3, c8.ja.d(-1, 20.0f, (z11 ? 5 : 3) | 48, z11 ? 54.0f : 67.0f, 10.0f, z11 ? 67.0f : 54.0f, 0.0f));
            org.telegram.ui.ActionBar.j5 j5Var4 = new org.telegram.ui.ActionBar.j5(context);
            u30Var.c = j5Var4;
            j5Var4.setTextSize(15);
            j5Var4.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
            j5Var4.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, u30Var.n, false));
            j5Var4.l(org.telegram.messenger.hd.M0(2131749105, null), false);
            boolean z12 = org.telegram.messenger.hd.a0;
            u30Var.addView(j5Var4, c8.ja.d(-1, 20.0f, (z12 ? 5 : 3) | 48, z12 ? 54.0f : 67.0f, 32.0f, z12 ? 67.0f : 54.0f, 0.0f));
            ImageView imageView3 = new ImageView(context);
            u30Var.d = imageView3;
            imageView3.setScaleType(ImageView.ScaleType.CENTER);
            imageView3.setImageResource(R.drawable.msg_invited);
            imageView3.setImportantForAccessibility(2);
            imageView3.setPadding(0, 0, org.telegram.messenger.g0.L(4.0f), 0);
            imageView3.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, u30Var.n, false), PorterDuff.Mode.MULTIPLY));
            u30Var.addView(imageView3, c8.ja.d(48, -1.0f, (org.telegram.messenger.hd.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
            u30Var.setWillNotDraw(false);
            u30Var.setFocusable(true);
            view = u30Var;
        } else if (i7 == 4) {
            view = new v30(this, context);
        } else if (i7 == 5) {
            view = new org.telegram.ui.Components.bn(context, 14);
        } else if (i7 == 6) {
            TextView textView = new TextView(context);
            textView.setTextColor(-8682615);
            textView.setTextSize(1, 13.0f);
            textView.setGravity(1);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(10.0f));
            if (org.telegram.messenger.t3.W(c40Var.U2)) {
                textView.setText(org.telegram.messenger.hd.a0(null, null, 2131743449, org.telegram.messenger.hd.G(org.telegram.messenger.np.s1(cVar.a).a4, "Participants", new Object[0])));
                view = textView;
            } else {
                textView.setText(org.telegram.messenger.hd.a0(null, null, 2131743225, org.telegram.messenger.hd.G(org.telegram.messenger.np.s1(cVar.a).a4, "Members", new Object[0])));
                view = textView;
            }
        } else if (i7 != 7) {
            view = new View(context);
        } else {
            if (c40Var.k2 == null) {
                c40Var.k2 = new g.b();
            }
            view = new rv(context, c40Var.k2);
        }
        return i5.c.q(view, view, -1, -2);
    }

    @Override // v4.h0
    public final void y(v4.e1 e1Var) {
        a30 a30Var = this.N.J1;
        int i7 = e1Var.f;
        View view = e1Var.a;
        if (i7 == 1) {
            org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) view;
            int i10 = a30Var.getTag() != null ? org.telegram.ui.ActionBar.j6.ih : org.telegram.ui.ActionBar.j6.dh;
            f4Var.f(i10, org.telegram.ui.ActionBar.j6.x0(null, i10, false));
            f4Var.setDrawDivider(e1Var.b() != this.G - 2);
            return;
        }
        if (i7 == 2) {
            org.telegram.ui.Cells.y3 y3Var = (org.telegram.ui.Cells.y3) view;
            int i11 = a30Var.getTag() != null ? org.telegram.ui.ActionBar.j6.ih : org.telegram.ui.ActionBar.j6.dh;
            y3Var.a(i11, org.telegram.ui.ActionBar.j6.x0(null, i11, false));
            y3Var.setDrawDivider(e1Var.b() != this.G - 2);
        }
    }
}
