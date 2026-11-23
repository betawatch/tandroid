package xg;

import ah.r;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ma;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.mj0;
import org.telegram.ui.Components.nv0;
import ug.z;
import v4.f1;
import v4.q0;
import wg.a1;
import wg.q;
import wg.y0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h extends rg.b {
    public final h6 d;
    public final Context e;
    public ek0 f;
    public ArrayList n;
    public boolean s;
    public y3 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public h(Context context, h6 h6Var, boolean z10) {
        this.e = context;
        this.x = z10;
        this.d = h6Var;
        z zVar = new z(this, 8);
        ur a02 = ur.a0(k10.t0);
        a02.a.c(new q(2, a02, zVar));
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(f1 f1Var) {
        int i7 = f1Var.f;
        return i7 == 3 || i7 == 6 || i7 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull P0 = np.u1(k10.t0).P0(chat.id);
        if (P0 != null && (i7 = P0.participants_count) > 0) {
            return i7;
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

    @Override // v4.i0
    public final int b() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i7 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i7)).a;
    }

    @Override // v4.i0
    public final void t(f1 f1Var, int i7) {
        boolean z10;
        int i10;
        ArrayList arrayList = this.n;
        if (arrayList == null || i7 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i7);
        int i11 = f1Var.f;
        View view = f1Var.a;
        int i12 = 8;
        if (i11 == 3) {
            r rVar = (r) view;
            gVar.getClass();
            TLRPC.User user = gVar.c;
            if (user != null) {
                rVar.setUser(user);
                String str = gVar.g;
                if (str != null) {
                    rVar.setSubtitle(str);
                    t6.X(rVar.e, m6.r5, this.d);
                }
            } else {
                TLRPC.InputPeer inputPeer = gVar.d;
                if (inputPeer != null) {
                    if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                        rVar.setUser(k10.i(k10.t0).f());
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        rVar.setUser(np.u1(k10.t0).c2(Long.valueOf(inputPeer.user_id)));
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        TLRPC.Chat O0 = np.u1(k10.t0).O0(Long.valueOf(inputPeer.chat_id));
                        rVar.h(F(O0), O0);
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        TLRPC.Chat O02 = np.u1(k10.t0).O0(Long.valueOf(inputPeer.channel_id));
                        rVar.h(F(O02), O02);
                    }
                }
            }
            rVar.c(gVar.j, false);
            rVar.i(false, 1.0f);
            int i13 = i7 + 1;
            rVar.setDivider(i13 >= this.n.size() || ((g) this.n.get(i13)).a == i11);
            if (i13 < this.n.size() && ((g) this.n.get(i13)).a == 7) {
                rVar.setDivider(false);
            }
            rVar.setOptions(gVar.m);
            a1 a1Var = gVar.n;
            a1 a1Var2 = gVar.o;
            ImageView imageView = rVar.G;
            ImageView imageView2 = rVar.E;
            boolean z11 = a1Var != null;
            rVar.y = z11;
            imageView2.setVisibility((z11 && rVar.H) ? 0 : 8);
            imageView2.setOnClickListener(a1Var);
            z10 = a1Var2 != null;
            rVar.F = z10;
            if (z10 && rVar.H) {
                i12 = 0;
            }
            imageView.setVisibility(i12);
            imageView.setOnClickListener(a1Var2);
            rVar.g(this.E, false);
            return;
        }
        if (i11 == 6) {
            ah.c cVar = (ah.c) view;
            z10 = i7 < this.n.size() - 1 && (i10 = i7 + 1) < this.n.size() - 1 && ((g) this.n.get(i10)).a != 7;
            cVar.w = gVar.e;
            cVar.f();
            cVar.setDivider(z10);
            cVar.c(gVar.j, false);
            return;
        }
        if (i11 == -1) {
            int i14 = gVar.k;
            if (i14 < 0) {
                i14 = (int) (g0.q.y * 0.3f);
            }
            view.setLayoutParams(new q0(-1, i14));
            return;
        }
        if (i11 == 7) {
            ((ah.f) view).setLetter(gVar.f);
            return;
        }
        if (i11 == 5) {
            try {
                ((nv0) view).b.getImageReceiver().P0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i11 != 8) {
            if (i11 == 9) {
                n8 n8Var = (n8) view;
                n8Var.g(m6.v6, m6.u6);
                n8Var.o(gVar.i, gVar.f, false);
                return;
            } else {
                if (i11 == 10) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.p) {
                        return;
                    }
                    g0.E2(gVar.p);
                    frameLayout.addView(gVar.p, ma.c(-2.0f, -1));
                    return;
                }
                return;
            }
        }
        y3 y3Var = (y3) view;
        if (TextUtils.equals(y3Var.getText(), gVar.f)) {
            String str2 = gVar.g;
            if (str2 == null) {
                str2 = "";
            }
            y3Var.a(str2, gVar.l);
        } else {
            y3Var.setText(j6.p(gVar.f, y3Var.getTextView(), null));
            if (!TextUtils.isEmpty(gVar.g)) {
                String str3 = gVar.g;
                y0 y0Var = gVar.l;
                x3 x3Var = y3Var.b;
                x3Var.c(str3, false, true);
                x3Var.setOnClickListener(y0Var);
                x3Var.setVisibility(0);
            }
        }
        this.w = y3Var;
    }

    @Override // v4.i0
    public final f1 x(ViewGroup viewGroup, int i7) {
        View rVar;
        Context context = this.e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new r(this.e, this.x, this.y, this.d, this.s);
        } else {
            h6 h6Var = this.d;
            if (i7 == 5) {
                nv0 nv0Var = new nv0(context, null, 1, h6Var);
                nv0Var.d.setText(hd.N0(2131747974, null));
                nv0Var.e.setText(hd.N0(2131745611, null));
                nv0Var.a.setTranslationY(g0.L(24.0f));
                rVar = nv0Var;
            } else {
                boolean z10 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, h6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z10) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, h6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    y3 y3Var = new y3(context, h6Var);
                    y3Var.setTag(-33024);
                    rVar = y3Var;
                    if (z10) {
                        y3Var.setBackground(null);
                        rVar = y3Var;
                    }
                } else if (i7 == 9) {
                    n8 n8Var = new n8(context, h6Var);
                    n8Var.n = 16;
                    n8Var.x = 19;
                    rVar = n8Var;
                } else {
                    rVar = i7 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new mj0(rVar);
    }

    @Override // v4.i0
    public final void y(f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof r) {
            ((r) view).g(this.E, false);
        }
    }
}
