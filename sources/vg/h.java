package vg;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.l4;
import ig.l0;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xp;
import qg.n;
import s4.b1;
import s4.o0;
import w7.z5;
import yg.k;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class h extends pg.b {
    public final d6 d;
    public final Context e;
    public im0 f;
    public ArrayList n;
    public boolean s;
    public u3 v;
    public final boolean w;
    public boolean x;
    public final HashMap r = new HashMap();
    public boolean y = true;
    public final boolean h = true;

    public h(Context context, d6 d6Var, boolean z10) {
        this.e = context;
        this.w = z10;
        this.d = d6Var;
        l0 l0Var = new l0(this, 24);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new uf.c(4, messagesStorage, l0Var));
    }

    @Override // org.telegram.ui.Components.hm0
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
                    ((sx0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    q8 q8Var = (q8) view;
                    q8Var.e(h6.v6, h6.u6);
                    q8Var.m(gVar.j, gVar.g, false);
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
                u3Var.b(charSequence, gVar.m);
            } else {
                u3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.g, u3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    CharSequence charSequence2 = gVar.h;
                    n nVar = gVar.m;
                    t3 t3Var = u3Var.b;
                    t3Var.c(charSequence2, false, true);
                    t3Var.setOnClickListener(nVar);
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
            l4 l4Var = kVar.d;
            l4Var.k(charSequence3);
            boolean[] zArr = kVar.s;
            zArr[0] = false;
            kVar.setSubtitle(charSequence4);
            kVar.e.setTextColor(h6.w0(zArr[0] ? h6.n5 : h6.r5, kVar.a));
            xp xpVar = kVar.v;
            if (xpVar != null) {
                xpVar.setAlpha(1.0f);
            }
            l4Var.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                kVar.setUser(user);
                CharSequence charSequence5 = gVar.h;
                if (charSequence5 != null) {
                    kVar.setSubtitle(charSequence5);
                    kVar.e.setTextColor(h6.w0(h6.r5, this.d));
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
        ug.b1 b1Var2 = gVar.o;
        ug.b1 b1Var3 = gVar.p;
        ImageView imageView = kVar.F;
        ImageView imageView2 = kVar.y;
        boolean z11 = b1Var2 != null;
        kVar.x = z11;
        imageView2.setVisibility((z11 && kVar.G) ? 0 : 8);
        imageView2.setOnClickListener(b1Var2);
        z10 = b1Var3 != null;
        kVar.E = z10;
        if (z10 && kVar.G) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(b1Var3);
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
            d6 d6Var = this.d;
            if (i10 == 5) {
                sx0 sx0Var = new sx0(context, null, 1, d6Var);
                sx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                sx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                sx0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                kVar = sx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    yg.d dVar = new yg.d(context, d6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    yg.b bVar = new yg.b(context, d6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    u3 u3Var = new u3(context, d6Var);
                    u3Var.setTag(-33024);
                    kVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        kVar = u3Var;
                    }
                } else if (i10 == 9) {
                    q8 q8Var = new q8(context, d6Var);
                    q8Var.n = 16;
                    q8Var.w = 19;
                    kVar = q8Var;
                } else {
                    kVar = i10 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new sl0(kVar);
    }

    @Override // s4.g0
    public final void y(b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof k) {
            ((k) view).g(this.y, false);
        }
    }
}
