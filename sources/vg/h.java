package vg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bi.l5;
import java.util.ArrayList;
import java.util.HashMap;
import ji.p1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.bz0;
import s4.b1;
import s4.o0;
import ug.c1;
import w7.z5;
import yg.l;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class h extends pg.b {
    public final c6 d;
    public final Context e;
    public mm0 f;
    public ArrayList n;
    public boolean s;
    public v3 v;
    public final boolean w;
    public boolean x;
    public final HashMap r = new HashMap();
    public boolean y = true;
    public final boolean h = true;

    public h(Context context, c6 c6Var, boolean z10) {
        this.e = context;
        this.w = z10;
        this.d = c6Var;
        p1 p1Var = new p1(this, 18);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new s9.b(13, messagesStorage, p1Var));
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
                    r8Var.e(g6.v6, g6.u6);
                    r8Var.m(gVar.j, gVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == gVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(gVar.q);
                        frameLayout.addView(gVar.q, z5.d(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            v3 v3Var = (v3) view;
            if (TextUtils.equals(v3Var.getText(), gVar.g)) {
                String str = gVar.h;
                if (str == null) {
                    str = "";
                }
                v3Var.b(str, gVar.m);
            } else {
                v3Var.setText(Emoji.replaceWithRestrictedEmoji(gVar.g, v3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(gVar.h)) {
                    String str2 = gVar.h;
                    bz0 bz0Var = gVar.m;
                    u3 u3Var = v3Var.b;
                    u3Var.c(str2, false, true);
                    u3Var.setOnClickListener(bz0Var);
                    u3Var.setVisibility(0);
                }
            }
            this.v = v3Var;
            return;
        }
        l lVar = (l) view;
        cr crVar = gVar.r;
        if (crVar != null) {
            CharSequence charSequence = gVar.g;
            String str3 = gVar.h;
            lVar.w.setVisibility(8);
            lVar.H = null;
            lVar.I = null;
            z9 z9Var = lVar.c;
            z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            z9Var.setImageDrawable(crVar);
            l5 l5Var = lVar.d;
            l5Var.k(charSequence);
            boolean[] zArr = lVar.s;
            zArr[0] = false;
            lVar.setSubtitle(str3);
            lVar.e.setTextColor(g6.w0(zArr[0] ? g6.n5 : g6.r5, lVar.a));
            aq aqVar = lVar.v;
            if (aqVar != null) {
                aqVar.setAlpha(1.0f);
            }
            l5Var.i(null);
        } else {
            TLRPC.User user = gVar.c;
            if (user != null) {
                lVar.setUser(user);
                String str4 = gVar.h;
                if (str4 != null) {
                    lVar.setSubtitle(str4);
                    lVar.e.setTextColor(g6.w0(g6.r5, this.d));
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

    @Override // s4.g0
    public final b1 x(ViewGroup viewGroup, int i10) {
        View lVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.e, this.w, this.x, this.d, this.s);
        } else {
            c6 c6Var = this.d;
            if (i10 == 5) {
                wx0 wx0Var = new wx0(context, null, 1, c6Var);
                wx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                wx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                wx0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = wx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    yg.d dVar = new yg.d(context, c6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    yg.b bVar = new yg.b(context, c6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    v3 v3Var = new v3(context, c6Var);
                    v3Var.setTag(-33024);
                    lVar = v3Var;
                    if (z10) {
                        v3Var.setBackground(null);
                        lVar = v3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, c6Var);
                    r8Var.n = 16;
                    r8Var.w = 19;
                    lVar = r8Var;
                } else {
                    lVar = i10 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new wl0(lVar);
    }

    @Override // s4.g0
    public final void y(b1 b1Var) {
        View view = b1Var.a;
        if (view instanceof l) {
            ((l) view).g(this.y, false);
        }
    }
}
