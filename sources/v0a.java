// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v0a extends ka {
    public final ylb d;
    public final Context e;
    public r59 f;
    public ArrayList n;
    public boolean s;
    public l55 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public v0a(ylb ylbVar, Context context, boolean z) {
        this.e = context;
        this.x = z;
        this.d = ylbVar;
        eg9 eg9Var = new eg9(this, (byte) 4);
        cf7 Y = cf7.Y(z8c.t0);
        Y.a.c(new x30(Y, eg9Var, (byte) 12));
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 3 || i == 6 || i == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i;
        TLRPC.ChatFull M0 = oc7.r1(z8c.t0).M0(chat.id);
        if (M0 != null && (i = M0.participants_count) > 0) {
            return i;
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

    @Override // y59
    public final int b() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // y59
    public final int d(int i) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i < 0) {
            return -1;
        }
        return ((u0a) arrayList.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        boolean z;
        int i2;
        ArrayList arrayList = this.n;
        if (arrayList == null || i < 0) {
            return;
        }
        u0a u0aVar = (u0a) arrayList.get(i);
        int i3 = u69Var.f;
        View view = u69Var.a;
        int i4 = 8;
        if (i3 == 3) {
            m1a m1aVar = (m1a) view;
            u0aVar.getClass();
            TLRPC.User user = u0aVar.c;
            if (user != null) {
                m1aVar.setUser(user);
                String str = u0aVar.g;
                if (str != null) {
                    m1aVar.setSubtitle(str);
                    anb.W(m1aVar.e, cmb.q5, this.d);
                }
            } else {
                TLRPC.InputPeer inputPeer = u0aVar.d;
                if (inputPeer != null) {
                    if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                        m1aVar.setUser(z8c.h(z8c.t0).f());
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                        m1aVar.setUser(oc7.r1(z8c.t0).W1(Long.valueOf(inputPeer.user_id)));
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                        TLRPC.Chat L0 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.chat_id));
                        m1aVar.h(F(L0), L0);
                    } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                        TLRPC.Chat L02 = oc7.r1(z8c.t0).L0(Long.valueOf(inputPeer.channel_id));
                        m1aVar.h(F(L02), L02);
                    }
                }
            }
            m1aVar.c(u0aVar.j, false);
            m1aVar.i(false, 1.0f);
            int i5 = i + 1;
            m1aVar.setDivider(i5 >= this.n.size() || ((u0a) this.n.get(i5)).a == i3);
            if (i5 < this.n.size() && ((u0a) this.n.get(i5)).a == 7) {
                m1aVar.setDivider(false);
            }
            m1aVar.setOptions(u0aVar.m);
            p9c p9cVar = u0aVar.n;
            p9c p9cVar2 = u0aVar.o;
            ImageView imageView = m1aVar.G;
            ImageView imageView2 = m1aVar.E;
            boolean z2 = p9cVar != null;
            m1aVar.y = z2;
            imageView2.setVisibility((z2 && m1aVar.H) ? 0 : 8);
            imageView2.setOnClickListener(p9cVar);
            z = p9cVar2 != null;
            m1aVar.F = z;
            if (z && m1aVar.H) {
                i4 = 0;
            }
            imageView.setVisibility(i4);
            imageView.setOnClickListener(p9cVar2);
            m1aVar.g(this.E, false);
            return;
        }
        if (i3 == 6) {
            d1a d1aVar = (d1a) view;
            z = i < this.n.size() - 1 && (i2 = i + 1) < this.n.size() - 1 && ((u0a) this.n.get(i2)).a != 7;
            d1aVar.w = u0aVar.e;
            d1aVar.f();
            d1aVar.setDivider(z);
            d1aVar.c(u0aVar.j, false);
            return;
        }
        if (i3 == -1) {
            int i6 = u0aVar.k;
            if (i6 < 0) {
                i6 = (int) (gm.q.y * 0.3f);
            }
            view.setLayoutParams(new g69(-1, i6));
            return;
        }
        if (i3 == 7) {
            ((f1a) view).setLetter(u0aVar.f);
            return;
        }
        if (i3 == 5) {
            try {
                ((a1b) view).b.getImageReceiver().w0(false);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        if (i3 != 8) {
            if (i3 == 9) {
                xib xibVar = (xib) view;
                xibVar.g(cmb.u6, cmb.t6);
                xibVar.o(u0aVar.i, u0aVar.f, false);
                return;
            } else {
                if (i3 == 10) {
                    FrameLayout frameLayout = (FrameLayout) view;
                    if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == u0aVar.p) {
                        return;
                    }
                    gm.B2(u0aVar.p);
                    frameLayout.addView(u0aVar.p, qoe.c(-2.0f, -1));
                    return;
                }
                return;
            }
        }
        l55 l55Var = (l55) view;
        if (TextUtils.equals(l55Var.getText(), u0aVar.f)) {
            String str2 = u0aVar.g;
            if (str2 == null) {
                str2 = "";
            }
            l55Var.a(str2, u0aVar.l);
        } else {
            l55Var.setText(gw3.p(u0aVar.f, l55Var.getTextView(), null));
            if (!TextUtils.isEmpty(u0aVar.g)) {
                String str3 = u0aVar.g;
                fyb fybVar = u0aVar.l;
                rj rjVar = l55Var.b;
                rjVar.c(str3, false, true);
                rjVar.setOnClickListener(fybVar);
                rjVar.setVisibility(0);
            }
        }
        this.w = l55Var;
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View l55Var;
        View view;
        Context context = this.e;
        if (i == -1) {
            View view2 = new View(context);
            view2.setTag(-33024);
            view = view2;
        } else if (i == 3) {
            view = new m1a(this.e, this.x, this.y, this.d, this.s);
        } else {
            ylb ylbVar = this.d;
            if (i == 5) {
                a1b a1bVar = new a1b(context, null, 1, ylbVar);
                a1bVar.d.setText(jb6.M0(2131747901, null));
                a1bVar.e.setText(jb6.M0(2131745541, null));
                a1bVar.a.setTranslationY(gm.L(24.0f));
                view = a1bVar;
            } else {
                boolean z = this.h;
                if (i == 7) {
                    l55Var = new f1a(context, ylbVar);
                    l55Var.setTag(-33024);
                    if (z) {
                        l55Var.setBackground(null);
                    }
                } else if (i == 6) {
                    l55Var = new d1a(context, ylbVar);
                    l55Var.setTag(-33024);
                    if (z) {
                        l55Var.setBackground(null);
                    }
                } else if (i == 8) {
                    l55Var = new l55(context, ylbVar);
                    l55Var.setTag(-33024);
                    if (z) {
                        l55Var.setBackground(null);
                    }
                } else if (i == 9) {
                    xib xibVar = new xib(context, ylbVar);
                    xibVar.n = (byte) 16;
                    xibVar.x = 19;
                    view = xibVar;
                } else {
                    view = i == 10 ? new FrameLayout(context) : new View(context);
                }
                view = l55Var;
            }
        }
        return new b59(view);
    }

    @Override // y59
    public final void y(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof m1a) {
            ((m1a) view).g(this.E, false);
        }
    }
}
