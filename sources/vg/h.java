package vg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.k4;
import ig.k0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.xp;
import s4.b1;
import s4.o0;
import ug.a1;
import w7.z5;
import yg.k;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class h extends pg.b {
    public final g6 d;
    public final Context e;
    public mm0 f;
    public ArrayList n;
    public boolean s;
    public u3 v;
    public final boolean w;
    public boolean x;
    public final HashMap r = new HashMap();
    public boolean y = true;
    public final boolean h = true;

    public h(Context context, g6 g6Var, boolean z10) {
        this.e = context;
        this.w = z10;
        this.d = g6Var;
        k0 k0Var = new k0(this, 24);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new u2.k0(6, messagesStorage, k0Var));
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(b1 b1Var) {
        int i10 = b1Var.f;
        return i10 == 3 || i10 == 6 || i10 == 9;
    }

    public final int F(TLRPC.Chat chat) {
        Integer num;
        int i10;
        TLRPC.ChatFull chatFull = MessagesController.getInstance(UserConfig.selectedAccount).getChatFull(chat.id);
        if (chatFull != null && (i10 = chatFull.participants_count) > 0) {
            return i10;
        }
        HashMap hashMap = this.r;
        return (hashMap.isEmpty() || (num = (Integer) hashMap.get(Long.valueOf(chat.id))) == null) ? chat.participants_count : num.intValue();
    }

    public final void G() {
        ArrayList arrayList = this.n;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        m(this.n.size() - 1);
    }

    @Override // s4.g0
    public final int h() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i10 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i10)).a;
    }

    @Override // s4.g0
    public final void v(b1 b1Var, int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.n;
        if (arrayList == null || i10 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i10);
        int i12 = b1Var.f;
        View view = b1Var.a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                yg.b bVar = (yg.b) view;
                z10 = i10 < this.n.size() - 1 && (i11 = i10 + 1) < this.n.size() - 1 && ((g) this.n.get(i11)).a != 7;
                bVar.v = gVar.f;
                bVar.f();
                bVar.setDivider(z10);
                bVar.c(gVar.k, false);
                return;
            }
            if (i12 == -1) {
                int i14 = gVar.l;
                if (i14 < 0) {
                    i14 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new o0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((yg.d) view).setLetter(gVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((wx0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    r8 r8Var = (r8) view;
                    r8Var.g(k6.v6, k6.u6);
                    r8Var.o(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.q);
                        frameLayout.addView(gVar.q, z5.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            u3 u3Var = (u3) view;
            if (TextUtils.equals(u3Var.getText(), gVar.g)) {
                CharSequence charSequence = gVar.h;
                if (charSequence == null) {
                    charSequence = "";
                }
                u3Var.a(charSequence, gVar.m);
            } else {
                u3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.g, u3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    CharSequence charSequence2 = gVar.h;
                    org.telegram.ui.web.c cVar = gVar.m;
                    t3 t3Var = u3Var.b;
                    t3Var.c(charSequence2, false, true);
                    t3Var.setOnClickListener(cVar);
                    t3Var.setVisibility(0);
                }
            }
            this.v = u3Var;
            return;
        }
        k kVar = (k) view;
        Drawable drawable = gVar.r;
        if (drawable != null) {
            CharSequence charSequence3 = gVar.g;
            CharSequence charSequence4 = gVar.h;
            kVar.w.setVisibility(8);
            kVar.H = null;
            kVar.I = null;
            w9 w9Var = kVar.c;
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            w9Var.setImageDrawable(drawable);
            k4 k4Var = kVar.d;
            k4Var.k(charSequence3);
            boolean[] zArr = kVar.s;
            zArr[0] = false;
            kVar.setSubtitle(charSequence4);
            r6.Z(kVar.e, zArr[0] ? k6.n5 : k6.r5, kVar.a);
            xp xpVar = kVar.v;
            if (xpVar != null) {
                xpVar.setAlpha(1.0f);
            }
            k4Var.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                kVar.setUser(user);
                CharSequence charSequence5 = gVar.h;
                if (charSequence5 != null) {
                    kVar.setSubtitle(charSequence5);
                    r6.Z(kVar.e, k6.r5, this.d);
                }
            } else {
                TLRPC.Chat chat = gVar.e;
                if (chat != null) {
                    kVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            kVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            kVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                            kVar.h(F(chat2), chat2);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                            kVar.h(F(chat3), chat3);
                        }
                    }
                }
            }
        }
        kVar.c(gVar.k, false);
        kVar.i(1.0f, false);
        int i15 = i10 + 1;
        kVar.setDivider(i15 >= this.n.size() || ((g) this.n.get(i15)).a == i12);
        if (i15 < this.n.size() && ((g) this.n.get(i15)).a == 7) {
            kVar.setDivider(false);
        }
        kVar.setOptions(gVar.n);
        a1 a1Var = gVar.o;
        a1 a1Var2 = gVar.p;
        ImageView imageView = kVar.F;
        ImageView imageView2 = kVar.y;
        boolean z11 = a1Var != null;
        kVar.x = z11;
        imageView2.setVisibility((z11 && kVar.G) ? 0 : 8);
        imageView2.setOnClickListener(a1Var);
        z10 = a1Var2 != null;
        kVar.E = z10;
        if (z10 && kVar.G) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(a1Var2);
        kVar.g(this.y, false);
    }

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        View kVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            kVar = view;
        } else if (i10 == 3) {
            kVar = new k(this.e, this.w, this.x, this.d, this.s);
        } else {
            g6 g6Var = this.d;
            if (i10 == 5) {
                wx0 wx0Var = new wx0(context, null, 1, g6Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                wx0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                kVar = wx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    yg.d dVar = new yg.d(context, g6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    yg.b bVar = new yg.b(context, g6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    u3 u3Var = new u3(context, g6Var);
                    u3Var.setTag(-33024);
                    kVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        kVar = u3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, g6Var);
                    r8Var.n = 16;
                    r8Var.w = 19;
                    kVar = r8Var;
                } else {
                    kVar = i10 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new wl0(kVar);
    }

    @Override // s4.g0
    public final void y(b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof k) {
            ((k) view).g(this.y, false);
        }
    }
}
