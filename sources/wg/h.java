package wg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import di.l4;
import ig.o;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Cells.y3;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.y9;
import s4.e1;
import s4.q0;
import vg.c1;
import zg.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class h extends qg.b {
    public final u6 d;
    public final Context e;
    public nm0 f;
    public ArrayList n;
    public boolean s;
    public z3 v;
    public final boolean w;
    public boolean x;
    public final HashMap r = new HashMap();
    public boolean y = true;
    public final boolean h = true;

    public h(Context context, u6 u6Var, boolean z10) {
        this.e = context;
        this.w = z10;
        this.d = u6Var;
        o oVar = new o(this, 28);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new s9.g(23, messagesStorage, oVar));
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(e1 e1Var) {
        int i10 = e1Var.f;
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

    @Override // s4.h0
    public final int h() {
        ArrayList arrayList = this.n;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        ArrayList arrayList = this.n;
        if (arrayList == null || i10 < 0) {
            return -1;
        }
        return ((g) arrayList.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(e1 e1Var, int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.n;
        if (arrayList == null || i10 < 0) {
            return;
        }
        g gVar = (g) arrayList.get(i10);
        int i12 = e1Var.f;
        View view = e1Var.a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                zg.b bVar = (zg.b) view;
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
                view.setLayoutParams(new q0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((zg.d) view).setLetter(gVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((fy0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    v8 v8Var = (v8) view;
                    v8Var.g(y6.v6, y6.u6);
                    v8Var.o(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.q);
                        frameLayout.addView(gVar.q, kb1.g(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            z3 z3Var = (z3) view;
            if (TextUtils.equals(z3Var.getText(), gVar.g)) {
                CharSequence charSequence = gVar.h;
                if (charSequence == null) {
                    charSequence = "";
                }
                z3Var.a(charSequence, gVar.m);
            } else {
                z3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.g, z3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    CharSequence charSequence2 = gVar.h;
                    org.telegram.ui.web.c cVar = gVar.m;
                    y3 y3Var = z3Var.b;
                    y3Var.c(charSequence2, false, true);
                    y3Var.setOnClickListener(cVar);
                    y3Var.setVisibility(0);
                }
            }
            this.v = z3Var;
            return;
        }
        l lVar = (l) view;
        Drawable drawable = gVar.r;
        if (drawable != null) {
            CharSequence charSequence3 = gVar.g;
            CharSequence charSequence4 = gVar.h;
            lVar.w.setVisibility(8);
            lVar.H = null;
            lVar.I = null;
            y9 y9Var = lVar.c;
            y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            y9Var.setImageDrawable(drawable);
            l4 l4Var = lVar.d;
            l4Var.k(charSequence3);
            boolean[] zArr = lVar.s;
            zArr[0] = false;
            lVar.setSubtitle(charSequence4);
            f7.Y(lVar.e, zArr[0] ? y6.n5 : y6.r5, lVar.a);
            aq aqVar = lVar.v;
            if (aqVar != null) {
                aqVar.setAlpha(1.0f);
            }
            l4Var.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                lVar.setUser(user);
                CharSequence charSequence5 = gVar.h;
                if (charSequence5 != null) {
                    lVar.setSubtitle(charSequence5);
                    f7.Y(lVar.e, y6.r5, this.d);
                }
            } else {
                TLRPC.Chat chat = gVar.e;
                if (chat != null) {
                    lVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = gVar.d;
                    if (inputPeer != null) {
                        if (inputPeer instanceof TLRPC.TL_inputPeerSelf) {
                            lVar.setUser(UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser());
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerUser) {
                            lVar.setUser(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(inputPeer.user_id)));
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChat) {
                            TLRPC.Chat chat2 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.chat_id));
                            lVar.h(F(chat2), chat2);
                        } else if (inputPeer instanceof TLRPC.TL_inputPeerChannel) {
                            TLRPC.Chat chat3 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(inputPeer.channel_id));
                            lVar.h(F(chat3), chat3);
                        }
                    }
                }
            }
        }
        lVar.c(gVar.k, false);
        lVar.i(1.0f, false);
        int i15 = i10 + 1;
        lVar.setDivider(i15 >= this.n.size() || ((g) this.n.get(i15)).a == i12);
        if (i15 < this.n.size() && ((g) this.n.get(i15)).a == 7) {
            lVar.setDivider(false);
        }
        lVar.setOptions(gVar.n);
        c1 c1Var = gVar.o;
        c1 c1Var2 = gVar.p;
        ImageView imageView = lVar.F;
        ImageView imageView2 = lVar.y;
        boolean z11 = c1Var != null;
        lVar.x = z11;
        imageView2.setVisibility((z11 && lVar.G) ? 0 : 8);
        imageView2.setOnClickListener(c1Var);
        z10 = c1Var2 != null;
        lVar.E = z10;
        if (z10 && lVar.G) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(c1Var2);
        lVar.g(this.y, false);
    }

    @Override // s4.h0
    public final e1 x(ViewGroup viewGroup, int i10) {
        View lVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.e, this.w, this.x, this.d, this.s);
        } else {
            u6 u6Var = this.d;
            if (i10 == 5) {
                fy0 fy0Var = new fy0(context, null, 1, u6Var);
                fy0Var.d.setText(LocaleController.getString(R.string.NoResult));
                fy0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                fy0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = fy0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    zg.d dVar = new zg.d(context, u6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    zg.b bVar = new zg.b(context, u6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    z3 z3Var = new z3(context, u6Var);
                    z3Var.setTag(-33024);
                    lVar = z3Var;
                    if (z10) {
                        z3Var.setBackground(null);
                        lVar = z3Var;
                    }
                } else if (i10 == 9) {
                    v8 v8Var = new v8(context, u6Var);
                    v8Var.n = 16;
                    v8Var.w = 19;
                    lVar = v8Var;
                } else {
                    lVar = i10 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new wl0(lVar);
    }

    @Override // s4.h0
    public final void y(e1 e1Var) {
        View view = e1Var.a;
        if (view instanceof l) {
            ((l) view).g(this.y, false);
        }
    }
}
