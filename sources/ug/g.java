package ug;

import ai.a6;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.web.b1;
import org.telegram.ui.xy0;
import s4.c1;
import s4.p0;
import tg.d1;
import w7.x5;
import xg.l;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g extends og.b {
    public final f6 d;
    public final Context e;
    public ml0 f;
    public ArrayList n;
    public boolean s;
    public u3 v;
    public final boolean w;
    public boolean x;
    public final HashMap r = new HashMap();
    public boolean y = true;
    public final boolean h = true;

    public g(Context context, f6 f6Var, boolean z10) {
        this.e = context;
        this.w = z10;
        this.d = f6Var;
        b1 b1Var = new b1(this, 15);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new p2.b(20, messagesStorage, b1Var));
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(c1 c1Var) {
        int i10 = c1Var.f;
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
        return ((f) arrayList.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(c1 c1Var, int i10) {
        boolean z10;
        int i11;
        ArrayList arrayList = this.n;
        if (arrayList == null || i10 < 0) {
            return;
        }
        f fVar = (f) arrayList.get(i10);
        int i12 = c1Var.f;
        View view = c1Var.a;
        int i13 = 8;
        if (i12 != 3) {
            if (i12 == 6) {
                xg.b bVar = (xg.b) view;
                z10 = i10 < this.n.size() - 1 && (i11 = i10 + 1) < this.n.size() - 1 && ((f) this.n.get(i11)).a != 7;
                bVar.s = fVar.f;
                bVar.f();
                bVar.setDivider(z10);
                bVar.c(fVar.k, false);
                return;
            }
            if (i12 == -1) {
                int i14 = fVar.l;
                if (i14 < 0) {
                    i14 = (int) (AndroidUtilities.displaySize.y * 0.3f);
                }
                view.setLayoutParams(new p0(-1, i14));
                return;
            }
            if (i12 == 7) {
                ((xg.d) view).setLetter(fVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((zw0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    r8 r8Var = (r8) view;
                    r8Var.e(j6.v6, j6.u6);
                    r8Var.m(fVar.j, fVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == fVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(fVar.q);
                        frameLayout.addView(fVar.q, x5.c(-2.0f, -1));
                        return;
                    }
                    return;
                }
            }
            u3 u3Var = (u3) view;
            if (TextUtils.equals(u3Var.getText(), fVar.g)) {
                String str = fVar.h;
                if (str == null) {
                    str = "";
                }
                u3Var.b(str, fVar.m);
            } else {
                u3Var.setText(Emoji.replaceWithRestrictedEmoji(fVar.g, u3Var.getTextView(), (Runnable) null));
                if (!TextUtils.isEmpty(fVar.h)) {
                    String str2 = fVar.h;
                    xy0 xy0Var = fVar.m;
                    t3 t3Var = u3Var.b;
                    t3Var.c(str2, false, true);
                    t3Var.setOnClickListener(xy0Var);
                    t3Var.setVisibility(0);
                }
            }
            this.v = u3Var;
            return;
        }
        l lVar = (l) view;
        pq pqVar = fVar.r;
        if (pqVar != null) {
            CharSequence charSequence = fVar.g;
            String str3 = fVar.h;
            lVar.v.setVisibility(8);
            lVar.G = null;
            lVar.H = null;
            u9 u9Var = lVar.c;
            u9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            u9Var.setImageDrawable(pqVar);
            a6 a6Var = lVar.d;
            a6Var.k(charSequence);
            boolean[] zArr = lVar.r;
            zArr[0] = false;
            lVar.setSubtitle(str3);
            lVar.e.setTextColor(j6.v0(zArr[0] ? j6.n5 : j6.r5, lVar.a));
            np npVar = lVar.s;
            if (npVar != null) {
                npVar.setAlpha(1.0f);
            }
            a6Var.i(null);
        } else {
            TLRPC.User user = fVar.c;
            if (user != null) {
                lVar.setUser(user);
                String str4 = fVar.h;
                if (str4 != null) {
                    lVar.setSubtitle(str4);
                    lVar.e.setTextColor(j6.v0(j6.r5, this.d));
                }
            } else {
                TLRPC.Chat chat = fVar.e;
                if (chat != null) {
                    lVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = fVar.d;
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
        lVar.c(fVar.k, false);
        lVar.i(1.0f, false);
        int i15 = i10 + 1;
        lVar.setDivider(i15 >= this.n.size() || ((f) this.n.get(i15)).a == i12);
        if (i15 < this.n.size() && ((f) this.n.get(i15)).a == 7) {
            lVar.setDivider(false);
        }
        lVar.setOptions(fVar.n);
        d1 d1Var = fVar.o;
        d1 d1Var2 = fVar.p;
        ImageView imageView = lVar.E;
        ImageView imageView2 = lVar.x;
        boolean z11 = d1Var != null;
        lVar.w = z11;
        imageView2.setVisibility((z11 && lVar.F) ? 0 : 8);
        imageView2.setOnClickListener(d1Var);
        z10 = d1Var2 != null;
        lVar.y = z10;
        if (z10 && lVar.F) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(d1Var2);
        lVar.g(this.y, false);
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        View lVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            lVar = view;
        } else if (i10 == 3) {
            lVar = new l(this.e, this.w, this.x, this.d, this.s);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                zw0 zw0Var = new zw0(context, null, 1, f6Var);
                zw0Var.d.setText(LocaleController.getString(R.string.NoResult));
                zw0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                zw0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                lVar = zw0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    xg.d dVar = new xg.d(context, f6Var);
                    dVar.setTag(-33024);
                    lVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        lVar = dVar;
                    }
                } else if (i10 == 6) {
                    xg.b bVar = new xg.b(context, f6Var);
                    bVar.setTag(-33024);
                    lVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        lVar = bVar;
                    }
                } else if (i10 == 8) {
                    u3 u3Var = new u3(context, f6Var);
                    u3Var.setTag(-33024);
                    lVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        lVar = u3Var;
                    }
                } else if (i10 == 9) {
                    r8 r8Var = new r8(context, f6Var);
                    r8Var.n = 16;
                    r8Var.w = 19;
                    lVar = r8Var;
                } else {
                    lVar = i10 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new wk0(lVar);
    }

    @Override // s4.h0
    public final void y(c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof l) {
            ((l) view).g(this.y, false);
        }
    }
}
