package zh;

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.na;
import fi.u;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.c9;
import org.telegram.ui.ee;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d {
    public final g2 a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public u e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public b i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public c m;

    public d(TLRPC.Chat chat, g2 g2Var) {
        this.a = g2Var;
        this.b = chat;
        this.c = g2Var.getCurrentAccount();
    }

    public final void a(boolean z10, boolean z11) {
        if (z10 == (this.d.getVisibility() == 0)) {
            return;
        }
        if (z10) {
            int i7 = this.l;
            g2 g2Var = this.a;
            TLRPC.Chat chat = this.b;
            if (i7 == -1 && chat != null) {
                mp messagesController = g2Var.getMessagesController();
                long j3 = chat.id;
                this.l = messagesController.h7.getInt("chatPendingRequests" + j3, 0);
            }
            int i10 = this.k;
            int i11 = this.l;
            if (i10 == i11) {
                return;
            }
            if (i11 != 0 && chat != null) {
                g2Var.getMessagesController().P4(0, chat.id);
            }
        }
        c cVar = this.m;
        if (cVar != null) {
            cVar.e(z10, z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrameLayout b() {
        if (this.d == null) {
            g2 g2Var = this.a;
            FrameLayout frameLayout = new FrameLayout(g2Var.getParentActivity());
            this.d = frameLayout;
            final int i7 = 0;
            frameLayout.setBackground(n6.N0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: zh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            d dVar = this.b;
                            g2 g2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, g2Var2, dVar.b.id);
                            }
                            g2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().P4(dVar2.k, dVar2.b.id);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(g2Var.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, na.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            final int i10 = 1;
            u uVar = new u(i10, g2Var.getParentActivity(), 0 == true ? 1 : 0);
            this.e = uVar;
            uVar.setAvatarsTextSize(g0.L(18.0f));
            c9 c9Var = this.e.a;
            for (int i11 = 0; i11 < c9Var.c.length; i11++) {
                c9Var.j(0, 0, null);
            }
            this.f.addView(this.e, na.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(g2Var.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            u6.U(this.g, n6.We, g2Var.getResourceProvider());
            this.g.setTypeface(g0.o());
            this.f.addView(this.g, na.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(g2Var.getParentActivity());
            int i12 = n6.x7;
            int themedColor = g2Var.getThemedColor(i12);
            y h02 = n6.h0(436207615 & themedColor, 1, g0.L(14.0f));
            if ((themedColor >>> 24) == 255) {
                u6.Q(this.h, h02, null, u6.g(i12, 25), g2Var.getResourceProvider());
            } else {
                this.h.setBackground(h02);
            }
            u6.s(this.h, n6.Ue, g2Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(gd.N0(2131752029, null));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: zh.a
                public final /* synthetic */ d b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            d dVar = this.b;
                            g2 g2Var2 = dVar.a;
                            if (dVar.i == null) {
                                dVar.i = new b(dVar, g2Var2, dVar.b.id);
                            }
                            g2Var2.showDialog(dVar.i);
                            break;
                        default:
                            d dVar2 = this.b;
                            dVar2.a.getMessagesController().P4(dVar2.k, dVar2.b.id);
                            dVar2.l = dVar2.k;
                            dVar2.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, na.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                d(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(ee eeVar) {
        this.m = eeVar;
    }

    public final void d(int i7, List list, boolean z10) {
        if (this.d == null) {
            return;
        }
        g2 g2Var = this.a;
        if (i7 <= 0) {
            TLRPC.Chat chat = this.b;
            if (chat != null) {
                g2Var.getMessagesController().P4(0, chat.id);
                this.l = 0;
            }
            a(false, z10);
            this.k = 0;
            return;
        }
        if (this.k != i7) {
            this.k = i7;
            this.g.setText(gd.G(i7, "JoinUsersRequests", new Object[0]));
            a(true, z10);
            if (list == null || list.isEmpty()) {
                return;
            }
            int min = Math.min(3, list.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.User c22 = g2Var.getMessagesController().c2((Long) list.get(i10));
                if (c22 != null) {
                    this.e.b(i10, this.c, c22);
                }
            }
            this.e.setCount(min);
            this.e.a(true);
        }
    }
}
