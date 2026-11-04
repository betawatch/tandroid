package yg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import b8.mf;
import bh.p;
import ei.e4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.qr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.zu0;
import u4.d1;
import u4.p0;
import xg.z0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h extends sg.b {
    public final e6 d;
    public final Context e;
    public tj0 f;
    public ArrayList n;
    public boolean s;
    public x3 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public h(Context context, e6 e6Var, boolean z10) {
        this.e = context;
        this.x = z10;
        this.d = e6Var;
        xg.d dVar = new xg.d(this, 5);
        qr a02 = qr.a0(h10.t0);
        a02.a.c(new u9.a(25, a02, dVar));
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(d1 d1Var) {
        int i3 = d1Var.f;
        return i3 == 3 || i3 == 6 || i3 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i3;
        TLRPC.ChatFull N0 = hp.s1(h10.t0).N0(chat.id);
        if (N0 != null && (i3 = N0.participants_count) > 0) {
            return i3;
        }
        HashMap hashMap = this.r;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        ArrayList arrayList = this.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        g(this.n.size() - 1);
    }

    @Override // u4.h0
    public final int b() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i3 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i3)).a;
    }

    @Override // u4.h0
    public final void t(d1 d1Var, int i3) {
        boolean z10;
        int i10;
        ArrayList arrayList = this.n;
        if (arrayList == null || i3 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i3);
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = 8;
        if (i11 != 3) {
            if (i11 == 6) {
                bh.c cVar = (bh.c) view;
                z10 = i3 < this.n.size() - 1 && (i10 = i3 + 1) < this.n.size() - 1 && ((g) this.n.get(i10)).a != 7;
                cVar.w = gVar.f;
                cVar.f();
                cVar.setDivider(z10);
                cVar.c(gVar.k, false);
                return;
            }
            if (i11 == -1) {
                int i13 = gVar.l;
                if (i13 < 0) {
                    i13 = (int) (g0.q.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i13));
                return;
            }
            if (i11 == 7) {
                ((bh.e) view).setLetter(gVar.g);
                return;
            }
            if (i11 == 5) {
                try {
                    ((zu0) view).b.getImageReceiver().P0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i11 != 8) {
                if (i11 == 9) {
                    l8 l8Var = (l8) view;
                    l8Var.g(k6.v6, k6.u6);
                    l8Var.o(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i11 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        g0.E2(gVar.q);
                        frameLayout.addView(gVar.q, mf.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            x3 x3Var = (x3) view;
            if (TextUtils.equals(x3Var.getText(), gVar.g)) {
                CharSequence charSequence = gVar.h;
                if (charSequence == null) {
                    charSequence = "";
                }
                x3Var.a(charSequence, gVar.m);
            } else {
                x3Var.setText(i6.p(gVar.g, x3Var.getTextView(), null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    CharSequence charSequence2 = gVar.h;
                    org.telegram.ui.web.d dVar = gVar.m;
                    w3 w3Var = x3Var.b;
                    w3Var.c(charSequence2, false, true);
                    w3Var.setOnClickListener(dVar);
                    w3Var.setVisibility(0);
                }
            }
            this.w = x3Var;
            return;
        }
        p pVar = (p) view;
        Drawable drawable = gVar.r;
        if (drawable != null) {
            CharSequence charSequence3 = gVar.g;
            CharSequence charSequence4 = gVar.h;
            pVar.x.setVisibility(8);
            pVar.I = null;
            pVar.J = null;
            k9 k9Var = pVar.c;
            k9Var.setRoundRadius(g0.L(20.0f));
            k9Var.setImageDrawable(drawable);
            e4 e4Var = pVar.d;
            e4Var.k(charSequence3);
            boolean[] zArr = pVar.s;
            zArr[0] = false;
            pVar.setSubtitle(charSequence4);
            r6.Y(pVar.e, zArr[0] ? k6.n5 : k6.r5, pVar.a);
            wo woVar = pVar.w;
            if (woVar != null) {
                woVar.setAlpha(1.0f);
            }
            e4Var.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                pVar.setUser(user);
                CharSequence charSequence5 = gVar.h;
                if (charSequence5 != null) {
                    pVar.setSubtitle(charSequence5);
                    r6.Y(pVar.e, k6.r5, this.d);
                }
            } else {
                TLRPC.Chat chat = gVar.e;
                if (chat != null) {
                    pVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            pVar.setUser(h10.i(h10.t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            pVar.setUser(hp.s1(h10.t0).a2(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat M0 = hp.s1(h10.t0).M0(Long.valueOf(inputPeer.chat_id));
                            pVar.h(F(M0), M0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat M02 = hp.s1(h10.t0).M0(Long.valueOf(inputPeer.channel_id));
                            pVar.h(F(M02), M02);
                        }
                    }
                }
            }
        }
        pVar.c(gVar.k, false);
        pVar.i(false, 1.0f);
        int i14 = i3 + 1;
        pVar.setDivider(i14 >= this.n.size() || ((g) this.n.get(i14)).a == i11);
        if (i14 < this.n.size() && ((g) this.n.get(i14)).a == 7) {
            pVar.setDivider(false);
        }
        pVar.setOptions(gVar.n);
        z0 z0Var = gVar.o;
        z0 z0Var2 = gVar.p;
        ImageView imageView = pVar.G;
        ImageView imageView2 = pVar.E;
        boolean z11 = z0Var != null;
        pVar.y = z11;
        imageView2.setVisibility((z11 && pVar.H) ? 0 : 8);
        imageView2.setOnClickListener(z0Var);
        z10 = z0Var2 != null;
        pVar.F = z10;
        if (z10 && pVar.H) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(z0Var2);
        pVar.g(this.E, false);
    }

    @Override // u4.h0
    public final d1 x(ViewGroup viewGroup, int i3) {
        View pVar;
        Context context = this.e;
        if (i3 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            pVar = view;
        } else if (i3 == 3) {
            pVar = new p(this.e, this.x, this.y, this.d, this.s);
        } else {
            e6 e6Var = this.d;
            if (i3 == 5) {
                zu0 zu0Var = new zu0(context, null, 1, e6Var);
                zu0Var.d.setText(bd.M0(2131748175, null));
                zu0Var.e.setText(bd.M0(2131745817, null));
                zu0Var.a.setTranslationY(g0.L(24.0f));
                pVar = zu0Var;
            } else {
                boolean z10 = this.h;
                if (i3 == 7) {
                    bh.e eVar = new bh.e(context, e6Var);
                    eVar.setTag(-33024);
                    pVar = eVar;
                    if (z10) {
                        eVar.setBackground(null);
                        pVar = eVar;
                    }
                } else if (i3 == 6) {
                    bh.c cVar = new bh.c(context, e6Var);
                    cVar.setTag(-33024);
                    pVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        pVar = cVar;
                    }
                } else if (i3 == 8) {
                    x3 x3Var = new x3(context, e6Var);
                    x3Var.setTag(-33024);
                    pVar = x3Var;
                    if (z10) {
                        x3Var.setBackground(null);
                        pVar = x3Var;
                    }
                } else if (i3 == 9) {
                    l8 l8Var = new l8(context, e6Var);
                    l8Var.n = 16;
                    l8Var.x = 19;
                    pVar = l8Var;
                } else {
                    pVar = i3 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new bj0(pVar);
    }

    @Override // u4.h0
    public final void y(d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof p) {
            ((p) view).g(this.E, false);
        }
    }
}
