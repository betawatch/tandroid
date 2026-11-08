package xg;

import ah.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ha;
import di.d4;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.i6;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xi0;
import v4.d1;
import v4.o0;
import wg.a1;
import wg.z0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class i extends rg.b {
    public final f6 d;
    public final Context e;
    public pj0 f;
    public ArrayList n;
    public boolean s;
    public x3 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean D = true;
    public final boolean h = true;

    public i(Context context, f6 f6Var, boolean z9) {
        this.e = context;
        this.x = z9;
        this.d = f6Var;
        a aVar = new a(this, 2);
        yr a02 = yr.a0(p10.s0);
        a02.a.c(new u9.f(17, a02, aVar));
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(d1 d1Var) {
        int i7 = d1Var.f;
        return i7 == 3 || i7 == 6 || i7 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = qp.s1(p10.s0).N0(chat.id);
        if (N0 != null && (i7 = N0.participants_count) > 0) {
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

    @Override // v4.g0
    public final int b() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // v4.g0
    public final int d(int i7) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i7 < 0) {
            return -1;
        }
        return ((h) arrayList.get(i7)).a;
    }

    @Override // v4.g0
    public final void t(d1 d1Var, int i7) {
        boolean z9;
        int i10;
        ArrayList arrayList = this.n;
        if (arrayList == null || i7 < 0) {
            return;
        }
        h hVar = (h) arrayList.get(i7);
        int i11 = d1Var.f;
        View view = d1Var.a;
        int i12 = 8;
        if (i11 != 3) {
            if (i11 == 6) {
                ah.c cVar = (ah.c) view;
                z9 = i7 < this.n.size() - 1 && (i10 = i7 + 1) < this.n.size() - 1 && ((h) this.n.get(i10)).a != 7;
                cVar.w = hVar.f;
                cVar.f();
                cVar.setDivider(z9);
                cVar.c(hVar.k, false);
                return;
            }
            if (i11 == -1) {
                int i13 = hVar.l;
                if (i13 < 0) {
                    i13 = (int) (g0.q.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i13));
                return;
            }
            if (i11 == 7) {
                ((ah.f) view).setLetter(hVar.g);
                return;
            }
            if (i11 == 5) {
                try {
                    ((av0) view).b.getImageReceiver().P0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i11 != 8) {
                if (i11 == 9) {
                    m8 m8Var = (m8) view;
                    m8Var.g(k6.v6, k6.u6);
                    m8Var.o(hVar.j, hVar.g, false);
                    return;
                } else {
                    if (i11 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == hVar.q) {
                            return;
                        }
                        g0.E2(hVar.q);
                        frameLayout.addView(hVar.q, ha.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            x3 x3Var = (x3) view;
            if (TextUtils.equals(x3Var.getText(), hVar.g)) {
                CharSequence charSequence = hVar.h;
                if (charSequence == null) {
                    charSequence = "";
                }
                x3Var.a(charSequence, hVar.m);
            } else {
                x3Var.setText(i6.p(hVar.g, x3Var.getTextView(), null));
                if (!TextUtils.isEmpty(hVar.h)) {
                    CharSequence charSequence2 = hVar.h;
                    z0 z0Var = hVar.m;
                    w3 w3Var = x3Var.b;
                    w3Var.c(charSequence2, false, true);
                    w3Var.setOnClickListener(z0Var);
                    w3Var.setVisibility(0);
                }
            }
            this.w = x3Var;
            return;
        }
        r rVar = (r) view;
        Drawable drawable = hVar.r;
        if (drawable != null) {
            CharSequence charSequence3 = hVar.g;
            CharSequence charSequence4 = hVar.h;
            rVar.x.setVisibility(8);
            rVar.H = null;
            rVar.I = null;
            l9 l9Var = rVar.c;
            l9Var.setRoundRadius(g0.L(20.0f));
            l9Var.setImageDrawable(drawable);
            d4 d4Var = rVar.d;
            d4Var.k(charSequence3);
            boolean[] zArr = rVar.s;
            zArr[0] = false;
            rVar.setSubtitle(charSequence4);
            r6.Y(rVar.e, zArr[0] ? k6.n5 : k6.r5, rVar.a);
            wo woVar = rVar.w;
            if (woVar != null) {
                woVar.setAlpha(1.0f);
            }
            d4Var.i(null);
        } else {
            TLRPC.User user = hVar.c;
            if (user != null) {
                rVar.setUser(user);
                CharSequence charSequence5 = hVar.h;
                if (charSequence5 != null) {
                    rVar.setSubtitle(charSequence5);
                    r6.Y(rVar.e, k6.r5, this.d);
                }
            } else {
                TLRPC.Chat chat = hVar.e;
                if (chat != null) {
                    rVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = hVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            rVar.setUser(p10.i(p10.s0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            rVar.setUser(qp.s1(p10.s0).a2(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat M0 = qp.s1(p10.s0).M0(Long.valueOf(inputPeer.chat_id));
                            rVar.h(F(M0), M0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat M02 = qp.s1(p10.s0).M0(Long.valueOf(inputPeer.channel_id));
                            rVar.h(F(M02), M02);
                        }
                    }
                }
            }
        }
        rVar.c(hVar.k, false);
        rVar.i(false, 1.0f);
        int i14 = i7 + 1;
        rVar.setDivider(i14 >= this.n.size() || ((h) this.n.get(i14)).a == i11);
        if (i14 < this.n.size() && ((h) this.n.get(i14)).a == 7) {
            rVar.setDivider(false);
        }
        rVar.setOptions(hVar.n);
        a1 a1Var = hVar.o;
        a1 a1Var2 = hVar.p;
        ImageView imageView = rVar.F;
        ImageView imageView2 = rVar.D;
        boolean z10 = a1Var != null;
        rVar.y = z10;
        imageView2.setVisibility((z10 && rVar.G) ? 0 : 8);
        imageView2.setOnClickListener(a1Var);
        z9 = a1Var2 != null;
        rVar.E = z9;
        if (z9 && rVar.G) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(a1Var2);
        rVar.g(this.D, false);
    }

    @Override // v4.g0
    public final d1 x(ViewGroup viewGroup, int i7) {
        View rVar;
        Context context = this.e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new r(this.e, this.x, this.y, this.d, this.s);
        } else {
            f6 f6Var = this.d;
            if (i7 == 5) {
                av0 av0Var = new av0(context, null, 1, f6Var);
                av0Var.d.setText(id.M0(2131748168, null));
                av0Var.e.setText(id.M0(2131745810, null));
                av0Var.a.setTranslationY(g0.L(24.0f));
                rVar = av0Var;
            } else {
                boolean z9 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, f6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z9) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, f6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z9) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    x3 x3Var = new x3(context, f6Var);
                    x3Var.setTag(-33024);
                    rVar = x3Var;
                    if (z9) {
                        x3Var.setBackground(null);
                        rVar = x3Var;
                    }
                } else if (i7 == 9) {
                    m8 m8Var = new m8(context, f6Var);
                    m8Var.n = 16;
                    m8Var.x = 19;
                    rVar = m8Var;
                } else {
                    rVar = i7 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new xi0(rVar);
    }

    @Override // v4.g0
    public final void y(d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof r) {
            ((r) view).g(this.D, false);
        }
    }
}
