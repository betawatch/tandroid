package tg;

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
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.t3;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w9;
import org.telegram.ui.w71;
import org.telegram.ui.web.x1;
import org.telegram.ui.web.y1;
import s4.c1;
import s4.p0;
import sg.f1;
import w7.a6;
import wg.k;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class g extends ng.b {
    public final f6 d;
    public final Context e;
    public vl0 f;
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
        y1 y1Var = new y1(this, 11);
        MessagesStorage messagesStorage = MessagesStorage.getInstance(UserConfig.selectedAccount);
        messagesStorage.getStorageQueue().postRunnable(new x1(21, messagesStorage, y1Var));
    }

    @Override // org.telegram.ui.Components.ul0
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
                wg.b bVar = (wg.b) view;
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
                ((wg.d) view).setLetter(fVar.g);
                return;
            }
            if (i12 == 5) {
                try {
                    ((jx0) view).b.getImageReceiver().startAnimation();
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            if (i12 != 8) {
                if (i12 == 9) {
                    s8 s8Var = (s8) view;
                    s8Var.e(j6.v6, j6.u6);
                    s8Var.m(fVar.j, fVar.g, false);
                    return;
                } else {
                    if (i12 == 10) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        if (frameLayout.getChildCount() == 1 && frameLayout.getChildAt(0) == fVar.q) {
                            return;
                        }
                        AndroidUtilities.removeFromParent(fVar.q);
                        frameLayout.addView(fVar.q, a6.c(-2.0f, -1));
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
                    w71 w71Var = fVar.m;
                    t3 t3Var = u3Var.b;
                    t3Var.c(str2, false, true);
                    t3Var.setOnClickListener(w71Var);
                    t3Var.setVisibility(0);
                }
            }
            this.v = u3Var;
            return;
        }
        k kVar = (k) view;
        vq vqVar = fVar.r;
        if (vqVar != null) {
            CharSequence charSequence = fVar.g;
            String str3 = fVar.h;
            kVar.v.setVisibility(8);
            kVar.G = null;
            kVar.H = null;
            w9 w9Var = kVar.c;
            w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
            w9Var.setImageDrawable(vqVar);
            f4 f4Var = kVar.d;
            f4Var.k(charSequence);
            boolean[] zArr = kVar.r;
            zArr[0] = false;
            kVar.setSubtitle(str3);
            kVar.e.setTextColor(j6.v0(zArr[0] ? j6.n5 : j6.r5, kVar.a));
            tp tpVar = kVar.s;
            if (tpVar != null) {
                tpVar.setAlpha(1.0f);
            }
            f4Var.i(null);
        } else {
            TLRPC.User user = fVar.c;
            if (user != null) {
                kVar.setUser(user);
                String str4 = fVar.h;
                if (str4 != null) {
                    kVar.setSubtitle(str4);
                    kVar.e.setTextColor(j6.v0(j6.r5, this.d));
                }
            } else {
                TLRPC.Chat chat = fVar.e;
                if (chat != null) {
                    kVar.h(F(chat), chat);
                } else {
                    TLRPC.InputPeer inputPeer = fVar.d;
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
        kVar.c(fVar.k, false);
        kVar.i(1.0f, false);
        int i15 = i10 + 1;
        kVar.setDivider(i15 >= this.n.size() || ((f) this.n.get(i15)).a == i12);
        if (i15 < this.n.size() && ((f) this.n.get(i15)).a == 7) {
            kVar.setDivider(false);
        }
        kVar.setOptions(fVar.n);
        f1 f1Var = fVar.o;
        f1 f1Var2 = fVar.p;
        ImageView imageView = kVar.E;
        ImageView imageView2 = kVar.x;
        boolean z11 = f1Var != null;
        kVar.w = z11;
        imageView2.setVisibility((z11 && kVar.F) ? 0 : 8);
        imageView2.setOnClickListener(f1Var);
        z10 = f1Var2 != null;
        kVar.y = z10;
        if (z10 && kVar.F) {
            i13 = 0;
        }
        imageView.setVisibility(i13);
        imageView.setOnClickListener(f1Var2);
        kVar.g(this.y, false);
    }

    @Override // s4.h0
    public final c1 x(ViewGroup viewGroup, int i10) {
        View kVar;
        Context context = this.e;
        if (i10 == -1) {
            View view = new View(context);
            view.setTag(-33024);
            kVar = view;
        } else if (i10 == 3) {
            kVar = new k(this.e, this.w, this.x, this.d, this.s);
        } else {
            f6 f6Var = this.d;
            if (i10 == 5) {
                jx0 jx0Var = new jx0(context, null, 1, f6Var);
                jx0Var.d.setText(LocaleController.getString(R.string.NoResult));
                jx0Var.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                jx0Var.a.setTranslationY(AndroidUtilities.dp(24.0f));
                kVar = jx0Var;
            } else {
                boolean z10 = this.h;
                if (i10 == 7) {
                    wg.d dVar = new wg.d(context, f6Var);
                    dVar.setTag(-33024);
                    kVar = dVar;
                    if (z10) {
                        dVar.setBackground(null);
                        kVar = dVar;
                    }
                } else if (i10 == 6) {
                    wg.b bVar = new wg.b(context, f6Var);
                    bVar.setTag(-33024);
                    kVar = bVar;
                    if (z10) {
                        bVar.setBackground(null);
                        kVar = bVar;
                    }
                } else if (i10 == 8) {
                    u3 u3Var = new u3(context, f6Var);
                    u3Var.setTag(-33024);
                    kVar = u3Var;
                    if (z10) {
                        u3Var.setBackground(null);
                        kVar = u3Var;
                    }
                } else if (i10 == 9) {
                    s8 s8Var = new s8(context, f6Var);
                    s8Var.n = 16;
                    s8Var.w = 19;
                    kVar = s8Var;
                } else {
                    kVar = i10 == 10 ? new FrameLayout(context) : new View(context);
                }
            }
        }
        return new fl0(kVar);
    }

    @Override // s4.h0
    public final void y(c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof k) {
            ((k) view).g(this.y, false);
        }
    }
}
