// default package

import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pz1 {
    public final e a;
    public final TLRPC.Chat b;
    public final int c;
    public FrameLayout d;
    public mz1 e;
    public LinearLayout f;
    public TextView g;
    public ImageView h;
    public nz1 i;
    public TLRPC.ChatFull j;
    public int k;
    public int l = -1;
    public oz1 m;

    public pz1(e eVar, TLRPC.Chat chat) {
        this.a = eVar;
        this.b = chat;
        this.c = eVar.getCurrentAccount();
    }

    public final void a(boolean z, boolean z2) {
        if (z != (this.d.getVisibility() == 0)) {
            if (z) {
                int i = this.l;
                e eVar = this.a;
                TLRPC.Chat chat = this.b;
                if (i == -1 && chat != null) {
                    uc7 messagesController = eVar.getMessagesController();
                    long j = chat.id;
                    i = messagesController.Y3.getInt("chatPendingRequests" + j, 0);
                    this.l = i;
                }
                if (this.k == i) {
                    return;
                }
                if (i != 0 && chat != null) {
                    eVar.getMessagesController().R4(0, chat.id);
                }
            }
            oz1 oz1Var = this.m;
            if (oz1Var != null) {
                oz1Var.g(z, z2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final FrameLayout b() {
        if (this.d == null) {
            e eVar = this.a;
            FrameLayout frameLayout = new FrameLayout(eVar.getParentActivity());
            this.d = frameLayout;
            final byte b = 0;
            frameLayout.setBackground(aob.L0(false));
            this.d.setOnClickListener(new View.OnClickListener(this) { // from class: lz1
                public final /* synthetic */ pz1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b2 = b;
                    pz1 pz1Var = this.b;
                    switch (b2) {
                        case 0:
                            e eVar2 = pz1Var.a;
                            nz1 nz1Var = pz1Var.i;
                            if (nz1Var == null) {
                                nz1Var = new nz1(pz1Var, eVar2, pz1Var.b.id);
                                pz1Var.i = nz1Var;
                            }
                            eVar2.showDialog(nz1Var);
                            break;
                        default:
                            pz1Var.a.getMessagesController().R4(pz1Var.k, pz1Var.b.id);
                            pz1Var.l = pz1Var.k;
                            pz1Var.a(false, true);
                            break;
                    }
                }
            });
            LinearLayout linearLayout = new LinearLayout(eVar.getParentActivity());
            this.f = linearLayout;
            linearLayout.setOrientation(0);
            this.d.addView(this.f, tre.d(-1, -1.0f, 48, 0.0f, 0.0f, 100.0f, 0.0f));
            mz1 mz1Var = new mz1(0 == true ? 1 : 0, eVar.getParentActivity(), 0 == true ? 1 : 0);
            this.e = mz1Var;
            mz1Var.setAvatarsTextSize(hl.L(18.0f));
            ic0 ic0Var = this.e.a;
            for (int i = 0; i < ic0Var.c.length; i++) {
                ic0Var.j(0, 0, null);
            }
            this.f.addView(this.e, tre.d(-2, -1.0f, 48, 8.0f, 0.0f, 10.0f, 0.0f));
            TextView textView = new TextView(eVar.getParentActivity());
            this.g = textView;
            textView.setEllipsize(TextUtils.TruncateAt.END);
            this.g.setGravity(16);
            this.g.setSingleLine();
            this.g.setText((CharSequence) null);
            yob.X(this.g, aob.We, eVar.getResourceProvider());
            this.g.setTypeface(hl.o());
            this.f.addView(this.g, tre.d(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.h = new ImageView(eVar.getParentActivity());
            int i2 = aob.x7;
            int themedColor = eVar.getThemedColor(i2);
            final byte b2 = 1;
            hf0 f0 = aob.f0(436207615 & themedColor, 1, hl.L(14.0f));
            int i3 = themedColor >>> 24;
            ImageView imageView = this.h;
            if (i3 == 255) {
                yob.R(imageView, f0, null, yob.g(i2, 25), eVar.getResourceProvider());
            } else {
                imageView.setBackground(f0);
            }
            yob.s(this.h, aob.Ue, eVar.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.h.setContentDescription(ob6.M0(2131752006, null));
            this.h.setImageResource(R.drawable.miniplayer_close);
            this.h.setScaleType(ImageView.ScaleType.CENTER);
            this.h.setOnClickListener(new View.OnClickListener(this) { // from class: lz1
                public final /* synthetic */ pz1 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b2;
                    pz1 pz1Var = this.b;
                    switch (b22) {
                        case 0:
                            e eVar2 = pz1Var.a;
                            nz1 nz1Var = pz1Var.i;
                            if (nz1Var == null) {
                                nz1Var = new nz1(pz1Var, eVar2, pz1Var.b.id);
                                pz1Var.i = nz1Var;
                            }
                            eVar2.showDialog(nz1Var);
                            break;
                        default:
                            pz1Var.a.getMessagesController().R4(pz1Var.k, pz1Var.b.id);
                            pz1Var.l = pz1Var.k;
                            pz1Var.a(false, true);
                            break;
                    }
                }
            });
            this.d.addView(this.h, tre.d(36, -1.0f, 53, 0.0f, 0.0f, 4.0f, 0.0f));
            TLRPC.ChatFull chatFull = this.j;
            if (chatFull != null) {
                c(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        return this.d;
    }

    public final void c(int i, List list, boolean z) {
        if (this.d != null) {
            e eVar = this.a;
            if (i <= 0) {
                TLRPC.Chat chat = this.b;
                if (chat != null) {
                    eVar.getMessagesController().R4(0, chat.id);
                    this.l = 0;
                }
                a(false, z);
                this.k = 0;
                return;
            }
            if (this.k != i) {
                this.k = i;
                this.g.setText(ob6.G(i, "JoinUsersRequests", new Object[0]));
                a(true, z);
                if (list == null || list.isEmpty()) {
                    return;
                }
                int min = Math.min(3, list.size());
                for (int i2 = 0; i2 < min; i2++) {
                    TLRPC.User X1 = eVar.getMessagesController().X1((Long) list.get(i2));
                    if (X1 != null) {
                        this.e.b(i2, this.c, X1);
                    }
                }
                this.e.setCount(min);
                this.e.a(true);
            }
        }
    }
}
