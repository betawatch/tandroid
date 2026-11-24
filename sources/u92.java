// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class u92 extends n39 {
    public final Context c;
    public final /* synthetic */ x92 d;

    public u92(x92 x92Var, Context context) {
        this.d = x92Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 0 || i == 2;
    }

    @Override // w39
    public final int b() {
        x92 x92Var = this.d;
        if (!x92Var.x || x92Var.y) {
            return x92Var.N;
        }
        return 0;
    }

    @Override // w39
    public final int d(int i) {
        if (i == 0) {
            return 3;
        }
        x92 x92Var = this.d;
        if (i == x92Var.G || i == x92Var.J) {
            return 2;
        }
        if (i < x92Var.H || i >= x92Var.I) {
            return i == x92Var.L ? 4 : 1;
        }
        return 0;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        x92 x92Var = this.d;
        boolean z = x92Var.s;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            gh6 gh6Var = (gh6) view;
            gh6Var.setTag(Integer.valueOf(i));
            TLRPC.Chat chat = (TLRPC.Chat) x92Var.w.get(i - x92Var.H);
            String K = hc2.K(chat, false);
            gh6Var.c(chat, null, TextUtils.isEmpty(K) ? null : b00.h("@", K), (i == x92Var.I - 1 && x92Var.h.linked_chat_id == 0) ? false : true);
            return;
        }
        if (i2 == 1) {
            mhb mhbVar = (mhb) view;
            if (i == x92Var.M) {
                mhbVar.setText(k96.M0(2131752291, null));
                return;
            } else {
                if (i == x92Var.K) {
                    if (z) {
                        mhbVar.setText(k96.M0(2131751375, null));
                        return;
                    } else {
                        mhbVar.setText(k96.M0(2131751371, null));
                        return;
                    }
                }
                return;
            }
        }
        if (i2 == 2) {
            dh6 dh6Var = (dh6) view;
            if (!z) {
                int i3 = bkb.o7;
                dh6Var.a(i3, i3);
                dh6Var.b(R.drawable.msg_remove, 5, k96.M0(2131751361, null), false);
            } else if (x92Var.h.linked_chat_id == 0) {
                dh6Var.a(bkb.u6, bkb.t6);
                dh6Var.b(R.drawable.msg_groups, 5, k96.M0(2131751373, null), true);
            } else {
                int i4 = bkb.o7;
                dh6Var.a(i4, i4);
                dh6Var.b(R.drawable.msg_remove, 5, k96.M0(2131751359, null), false);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout gh6Var;
        x92 x92Var = this.d;
        boolean z = x92Var.s;
        if (i != 0) {
            Context context = this.c;
            if (i == 1) {
                gh6Var = new mhb(context);
            } else if (i == 2) {
                gh6Var = new dh6(context);
            } else if (i != 4) {
                r92 r92Var = new r92(context);
                q92 q92Var = new q92(context);
                q92Var.c = y6c.t0;
                q92Var.setPadding(0, gl.L(12.0f), 0, gl.L(12.0f));
                q92Var.setOrientation(1);
                be0 be0Var = new be0(context);
                q92Var.a = be0Var;
                v86 v86Var = new v86(be0Var, "M476.1,397.4c25.8-47.2,0.3-105.9-50.9-120c-2.5-6.9-7.8-12.7-15-16.4l0.4-229.4c0-12.3-10-22.4-22.4-22.4H128.5c-12.3,0-22.4,10-22.4,22.4l-0.4,229.8v0c0,6.7,2.9,12.6,7.6,16.7c-51.6,15.9-79.2,77.2-48.1,116.4c-8.7,11.7-13.4,27.5-14,47.2c-1.7,34.5,21.6,45.8,55.9,45.8c52.3,0,99.1,4.6,105.1-36.2c16.5,0.9,7.1-37.3-6.5-53.3c18.4-22.4,18.3-52.9,4.9-78.2c-0.7-5.3-3.8-9.8-8.1-12.6c-1.5-2-1.6-2-2.1-2.7c0.2-1,1.2-11.8-3.4-20.9h138.5c-4.8,8.8-4.7,17-2.9,22.1c-5.3,4.8-6.8,12.3-5.2,17c-11.4,24.9-10,53.8,4.3,77.5c-6.8,9.7-11.2,21.7-12.6,31.6c-0.2-0.2-0.4-0.3-0.6-0.5c0.8-3.3,0.4-6.4-1.3-7.8c9.3-12.1-4.5-29.2-17-21.7c-3.8-2.8-10.6-3.2-18.1-0.5c-2.4-10.6-21.1-10.6-28.6-1c-1.3,0.3-2.9,0.8-4.5,1.9c-5.2-0.9-10.9,0.1-14.1,4.4c-6.9,3-9.5,10.4-7.8,17c-0.9,1.8-1.1,4-0.8,6.3c-1.6,1.2-2.3,3.1-2,4.9c0.1,0.6,10.4,56.6,11.2,62c0.3,1.8,1.5,3.2,3.1,3.9c8.7,3.4,12,3.8,30.1,9.4c2.7,0.8,2.4,0.8,6.7-0.1c16.4-3.5,30.2-8.9,30.8-9.2c1.6-0.6,2.7-2,3.1-3.7c0.1-0.4,6.8-36.5,10-53.2c0.9,4.2,3.3,7.3,7.4,7.5c1.2,7.8,4.4,14.5,9.5,19.9c16.4,17.3,44.9,15.7,64.9,16.1c38.3,0.8,74.5,1.5,84.4-24.4C488.9,453.5,491.3,421.3,476.1,397.4z", gl.L(104.0f), gl.L(104.0f));
                q92Var.b = v86Var;
                be0Var.setImageDrawable(v86Var);
                q92Var.addView(be0Var, nme.t(kk7.o1, kk7.o1, 49, 0, 2, 0, 0));
                r92Var.addView(q92Var, nme.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                zkb.X(textView, bkb.f9, null);
                textView.setTextSize(1, 14.0f);
                textView.setGravity(17);
                if (z) {
                    TLRPC.ChatFull chatFull = x92Var.h;
                    if (chatFull == null || chatFull.linked_chat_id == 0) {
                        textView.setText(k96.M0(2131751374, null));
                    } else {
                        TLRPC.Chat K0 = x92Var.getMessagesController().K0(Long.valueOf(x92Var.h.linked_chat_id));
                        if (K0 != null) {
                            de9.r("DiscussionChannelGroupSetHelp2", null, 2131751376, new Object[]{K0.title}, textView);
                        }
                    }
                } else {
                    TLRPC.Chat K02 = x92Var.getMessagesController().K0(Long.valueOf(x92Var.h.linked_chat_id));
                    if (K02 != null) {
                        de9.r("DiscussionGroupHelp", null, 2131751372, new Object[]{K02.title}, textView);
                    }
                }
                r92Var.addView(textView, nme.d(-1, -2.0f, 51, 52.0f, 143.0f, 52.0f, 18.0f));
                r92Var.setTag(-33024);
                gh6Var = r92Var;
            } else {
                TLRPC.Chat chat = z ? (TLRPC.Chat) x92Var.w.get(0) : x92Var.f;
                t92 t92Var = new t92(this, context, chat, chat);
                x92Var.E = t92Var;
                gh6Var = t92Var;
            }
        } else {
            gh6Var = new gh6(this.c, 6, 2, false, null);
        }
        return new y29(gh6Var);
    }
}
