package xh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.a0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.k9;
import org.telegram.ui.ve;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class d {
    public final n2 a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public a0 e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public b i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public c m;

    public d(TLRPC.Chat chat, n2 n2Var) {
        this.a = n2Var;
        this.b = chat;
        this.c = n2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i10 = this.l;
            n2 n2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i10 == -1 && chat != null) {
                this.l = n2Var.getMessagesController().getChatPendingRequestsOnClosed(chat.id);
            }
            int i11 = this.k;
            int i12 = this.l;
            if (i11 == i12) {
                return;
            }
            if (i12 != 0 && chat != null) {
                n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
            }
        }
        c cVar = this.m;
        if (cVar != null) {
            cVar.f(z10, z11);
        }
    }

    public final void b(ArrayList arrayList) {
        arrayList.add(new l6(this.g, 4, null, null, null, null, j6.fe));
        arrayList.add(new l6(this.h, 8, null, null, null, null, j6.de));
    }

    public final FrameLayout c() {
        if (this.d == null) {
            n2 n2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            this.d = frameLayout;
            frameLayout.setBackground(j6.K0(false));
            final int i10 = 0;
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            d dVar = this.b;
                            n2 n2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, n2Var2, dVar.b.id);
                            }
                            n2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().setChatPendingRequestsOnClose(dVar2.b.id, dVar2.k);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(n2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            int i11 = 1;
            a0 a0Var = new a0(i11, n2Var.getParentActivity(), false);
            this.e = a0Var;
            a0Var.setAvatarsTextSize(AndroidUtilities.dp(18.0f));
            k9 k9Var = this.e.a;
            for (int i12 = 0; i12 < k9Var.c.length; i12++) {
                k9Var.l(0, null, 0);
            }
            this.f.addView(this.e, x5.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(n2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            this.g.setTextColor(n2Var.getThemedColor(j6.fe));
            this.g.setTypeface(AndroidUtilities.bold());
            this.f.addView(this.g, x5.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(n2Var.getParentActivity());
            this.h = imageView;
            imageView.setBackground(j6.f0(n2Var.getThemedColor(j6.x7) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.h.setColorFilter(new PorterDuffColorFilter(n2Var.getThemedColor(j6.de), PorterDuff.Mode.MULTIPLY));
            this.h.setContentDescription(LocaleController.getString(R.string.Close));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            final int i13 = 1;
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: xh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            d dVar = this.b;
                            n2 n2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, n2Var2, dVar.b.id);
                            }
                            n2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().setChatPendingRequestsOnClose(dVar2.b.id, dVar2.k);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, x5.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                e(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void d(ve veVar) {
        this.m = veVar;
    }

    public final void e(int i10, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        n2 n2Var = this.a;
        if (i10 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                n2Var.getMessagesController().setChatPendingRequestsOnClose(chat.id, 0);
                this.l = 0;
            }
            a(false, z10);
            this.k = 0;
            return;
        }
        if (this.k != i10) {
            this.k = i10;
            this.g.setText(LocaleController.formatPluralString("JoinUsersRequests", i10, new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i11 = 0; i11 < min; i11++) {
                TLRPC.User user = n2Var.getMessagesController().getUser((Long) list.get(i11));
                if (user != null) {
                    this.e.b(i11, user, this.c);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
