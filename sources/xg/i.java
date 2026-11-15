package xg;

import ah.r;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import c8.ja;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Cells.x3;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.sc1;
import ug.p1;
import ug.t1;
import v4.e1;
import v4.p0;
import wg.x0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i extends rg.b {
    public final e6 d;
    public final Context e;
    public uj0 f;
    public ArrayList n;
    public boolean s;
    public x3 w;
    public final boolean x;
    public boolean y;
    public final HashMap r = new HashMap();
    public boolean E = true;
    public final boolean h = true;

    public i(Context context, e6 e6Var, boolean z10) {
        this.e = context;
        this.x = z10;
        this.d = e6Var;
        p1 p1Var = new p1(this, 7);
        vr a02 = vr.a0(m10.t0);
        a02.a.c(new t1(7, a02, p1Var));
    }

    @Override // org.telegram.ui.Components.tj0
    public final boolean D(e1 e1Var) {
        int i7 = e1Var.f;
        return i7 == 3 || i7 == 6 || i7 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i7;
        TLRPC.ChatFull N0 = np.s1(m10.t0).N0(chat.id);
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

    @Override // v4.h0
    public final int b() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // v4.h0
    public final int d(int i7) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i7 < 0) {
            return -1;
        }
        return ((h) arrayList.get(i7)).a;
    }

    @Override // v4.h0
    public final void t(e1 e1Var, int i7) {
        boolean z10;
        int i10;
        ArrayList arrayList = this.n;
        if (arrayList == null || i7 < 0) {
            return;
        }
        h hVar = (h) arrayList.get(i7);
        int i11 = e1Var.f;
        View view = e1Var.a;
        int i12 = 8;
        if (i11 != 3) {
            if (i11 == 6) {
                ah.c cVar = (ah.c) view;
                z10 = i7 < this.n.size() - 1 && (i10 = i7 + 1) < this.n.size() - 1 && ((h) this.n.get(i10)).a != 7;
                cVar.w = hVar.f;
                cVar.f();
                cVar.setDivider(z10);
                cVar.c(hVar.k, false);
                return;
            }
            if (i11 == -1) {
                int i13 = hVar.l;
                if (i13 < 0) {
                    i13 = (int) (g0.q.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i13));
                return;
            }
            if (i11 == 7) {
                ((ah.f) view).setLetter(hVar.g);
                return;
            }
            if (i11 == 5) {
                try {
                    ((cv0) view).b.getImageReceiver().P0(false);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i11 != 8) {
                if (i11 == 9) {
                    l8 l8Var = (l8) view;
                    l8Var.g(j6.v6, j6.u6);
                    l8Var.o(hVar.j, hVar.g, false);
                    return;
                } else {
                    if (i11 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == hVar.q) {
                            return;
                        }
                        g0.E2(hVar.q);
                        frameLayout.addView(hVar.q, ja.c(-2.0f, -1));
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
                x3Var.setText(org.telegram.messenger.j6.p(hVar.g, x3Var.getTextView(), null));
                if (!TextUtils.isEmpty(hVar.h)) {
                    CharSequence charSequence2 = hVar.h;
                    sc1 sc1Var = hVar.m;
                    w3 w3Var = x3Var.b;
                    w3Var.c(charSequence2, false, true);
                    w3Var.setOnClickListener(sc1Var);
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
            rVar.I = null;
            rVar.J = null;
            i9 i9Var = rVar.c;
            i9Var.setRoundRadius(g0.L(20.0f));
            i9Var.setImageDrawable(drawable);
            fi.w3 w3Var2 = rVar.d;
            w3Var2.k(charSequence3);
            boolean[] zArr = rVar.s;
            zArr[0] = false;
            rVar.setSubtitle(charSequence4);
            q6.X(rVar.e, zArr[0] ? j6.n5 : j6.r5, rVar.a);
            fp fpVar = rVar.w;
            if (fpVar != null) {
                fpVar.setAlpha(1.0f);
            }
            w3Var2.i(null);
        } else {
            TLRPC.User user = hVar.c;
            if (user != null) {
                rVar.setUser(user);
                CharSequence charSequence5 = hVar.h;
                if (charSequence5 != null) {
                    rVar.setSubtitle(charSequence5);
                    q6.X(rVar.e, j6.r5, this.d);
                }
            } else {
                TLRPC.Chat chat = hVar.e;
                if (chat != null) {
                    rVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = hVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            rVar.setUser(m10.i(m10.t0).f());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            rVar.setUser(np.s1(m10.t0).a2(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat M0 = np.s1(m10.t0).M0(Long.valueOf(inputPeer.chat_id));
                            rVar.h(F(M0), M0);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat M02 = np.s1(m10.t0).M0(Long.valueOf(inputPeer.channel_id));
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
        x0 x0Var = hVar.o;
        x0 x0Var2 = hVar.p;
        ImageView imageView = rVar.G;
        ImageView imageView2 = rVar.E;
        boolean z11 = x0Var != null;
        rVar.y = z11;
        imageView2.setVisibility((z11 && rVar.H) ? 0 : 8);
        imageView2.setOnClickListener(x0Var);
        z10 = x0Var2 != null;
        rVar.F = z10;
        if (z10 && rVar.H) {
            i12 = 0;
        }
        imageView.setVisibility(i12);
        imageView.setOnClickListener(x0Var2);
        rVar.g(this.E, false);
    }

    @Override // v4.h0
    public final e1 x(ViewGroup viewGroup, int i7) {
        View rVar;
        Context context = this.e;
        if (i7 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            rVar = view;
        } else if (i7 == 3) {
            rVar = new r(this.e, this.x, this.y, this.d, this.s);
        } else {
            e6 e6Var = this.d;
            if (i7 == 5) {
                cv0 cv0Var = new cv0(context, null, 1, e6Var);
                cv0Var.d.setText(hd.M0(2131748167, null));
                cv0Var.e.setText(hd.M0(2131745807, null));
                cv0Var.a.setTranslationY(g0.L(24.0f));
                rVar = cv0Var;
            } else {
                boolean z10 = this.h;
                if (i7 == 7) {
                    ah.f fVar = new ah.f(context, e6Var);
                    fVar.setTag(-33024);
                    rVar = fVar;
                    if (z10) {
                        fVar.setBackground(null);
                        rVar = fVar;
                    }
                } else if (i7 == 6) {
                    ah.c cVar = new ah.c(context, e6Var);
                    cVar.setTag(-33024);
                    rVar = cVar;
                    if (z10) {
                        cVar.setBackground(null);
                        rVar = cVar;
                    }
                } else if (i7 == 8) {
                    x3 x3Var = new x3(context, e6Var);
                    x3Var.setTag(-33024);
                    rVar = x3Var;
                    if (z10) {
                        x3Var.setBackground(null);
                        rVar = x3Var;
                    }
                } else if (i7 == 9) {
                    l8 l8Var = new l8(context, e6Var);
                    l8Var.n = 16;
                    l8Var.x = 19;
                    rVar = l8Var;
                } else {
                    rVar = i7 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new cj0(rVar);
    }

    @Override // v4.h0
    public final void y(e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof r) {
            ((r) view).g(this.E, false);
        }
    }
}
