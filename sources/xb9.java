// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xb9 extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public TLRPC.RequestPeerType a;
    public ArrayList b;

    public final void a(Boolean bool, int i, int i2) {
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            ArrayList arrayList = this.b;
            if (booleanValue) {
                arrayList.add(yb9.a(hl.S2(ob6.M0(i, null))));
            } else {
                arrayList.add(yb9.a(hl.S2(ob6.M0(i2, null))));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [boolean] */
    public void set(TLRPC.RequestPeerType requestPeerType) {
        ArrayList arrayList = this.b;
        if (this.a != requestPeerType) {
            this.a = requestPeerType;
            removeAllViews();
            arrayList.clear();
            if (requestPeerType instanceof TLRPC.TL_requestPeerTypeUser) {
                a(((TLRPC.TL_requestPeerTypeUser) requestPeerType).premium, 2131747066, 2131747067);
            } else {
                boolean z = requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast;
                if (z) {
                    a(requestPeerType.has_username, 2131747074, 2131747075);
                    Boolean bool = requestPeerType.bot_participant;
                    if (bool != null && bool.booleanValue()) {
                        arrayList.add(yb9.a(hl.S2(ob6.M0(2131747077, null))));
                    }
                    Boolean bool2 = requestPeerType.creator;
                    if (bool2 != null && bool2.booleanValue()) {
                        arrayList.add(yb9.a(hl.S2(ob6.M0(2131747076, null))));
                    }
                } else {
                    a(requestPeerType.has_username, 2131747068, 2131747069);
                    a(requestPeerType.forum, 2131747072, 2131747073);
                    Boolean bool3 = requestPeerType.bot_participant;
                    if (bool3 != null && bool3.booleanValue()) {
                        arrayList.add(yb9.a(hl.S2(ob6.M0(2131747071, null))));
                    }
                    Boolean bool4 = requestPeerType.creator;
                    if (bool4 != null && bool4.booleanValue()) {
                        arrayList.add(yb9.a(hl.S2(ob6.M0(2131747070, null))));
                    }
                }
                Boolean bool5 = requestPeerType.creator;
                if (bool5 == null || !bool5.booleanValue()) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.user_admin_rights;
                    SpannableStringBuilder S2 = hl.S2(ob6.M0(2131747064, null));
                    SpannableStringBuilder S22 = hl.S2(ob6.M0(2131747065, null));
                    if (tL_chatAdminRights != null) {
                        ArrayList arrayList2 = new ArrayList();
                        if (tL_chatAdminRights.change_info) {
                            qu6.q(1, z ? ob6.M0(2131751289, null) : ob6.M0(2131751288, null), arrayList2);
                        }
                        if (tL_chatAdminRights.post_messages && z) {
                            qu6.q(1, ob6.M0(2131751277, null), arrayList2);
                        }
                        if (tL_chatAdminRights.edit_messages && z) {
                            qu6.q(1, ob6.M0(2131751284, null), arrayList2);
                        }
                        if (tL_chatAdminRights.delete_messages) {
                            qu6.q(1, ob6.M0(z ? 2131751286 : 2131751281, null), arrayList2);
                        }
                        if (tL_chatAdminRights.ban_users && !z) {
                            qu6.q(1, ob6.M0(2131751293, null), arrayList2);
                        }
                        if (tL_chatAdminRights.invite_users) {
                            qu6.q(1, ob6.M0(2131751295, null), arrayList2);
                        }
                        if (tL_chatAdminRights.pin_messages && !z) {
                            qu6.q(1, ob6.M0(2131751278, null), arrayList2);
                        }
                        if (tL_chatAdminRights.add_admins) {
                            qu6.q(1, ob6.M0(2131751296, null), arrayList2);
                        }
                        if (tL_chatAdminRights.anonymous && !z) {
                            qu6.q(1, ob6.M0(2131751268, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_call) {
                            qu6.q(1, ob6.M0(2131744558, null), arrayList2);
                        }
                        if (tL_chatAdminRights.manage_topics && !z) {
                            qu6.q(1, ob6.M0(2131748446, null), arrayList2);
                        }
                        if (arrayList2.size() == 1) {
                            arrayList.add(yb9.a(TextUtils.concat(S22, " ", ((yb9) arrayList2.get(0)).b)));
                        } else if (!arrayList2.isEmpty()) {
                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(S2);
                            valueOf.append((CharSequence) " ");
                            for (int i = 0; i < arrayList2.size(); i++) {
                                if (i > 0) {
                                    valueOf.append((CharSequence) ", ");
                                }
                                valueOf.append((CharSequence) ((yb9) arrayList2.get(i)).b.toString().toLowerCase());
                            }
                            valueOf.append((CharSequence) ".");
                            arrayList.add(yb9.a(valueOf));
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            mf5 mf5Var = new mf5(getContext(), 20);
            mf5Var.setText(ob6.M0(2131747063, null));
            int i2 = aob.d6;
            yob.h(i2, null, mf5Var);
            addView(mf5Var, tre.o(-1, -2));
            View ak4Var = new ak4(getContext(), 9, (byte) 1);
            ak4Var.setBackground(null);
            yob.h(i2, null, ak4Var);
            addView(ak4Var, tre.o(-1, -2));
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                yb9 yb9Var = (yb9) obj;
                Context context = getContext();
                u1 u1Var = new u1((byte) 8, context, false);
                yob.h(aob.d6, null, u1Var);
                u1Var.setOrientation(0);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(yb9Var.a <= 0 ? R.drawable.list_check : R.drawable.list_circle);
                yob.s(imageView, aob.L6, null, PorterDuff.Mode.MULTIPLY);
                u1Var.addView(imageView, tre.q(20, 20, 0.0f, 51, ((yb9Var.a ? 1 : 0) << 4) + 17, -1, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 14.0f);
                yob.X(textView, aob.z6, null);
                textView.setSingleLine(false);
                textView.setText(yb9Var.b);
                u1Var.addView(textView, tre.t(-1, -2, 1, 6, 4, 24, 4));
                addView(u1Var, tre.o(-1, -2));
            }
            int i4 = aob.d6;
            View ak4Var2 = new ak4(getContext(), 12, (byte) 1);
            ak4Var2.setBackground(null);
            yob.h(i4, null, ak4Var2);
            addView(ak4Var2, tre.o(-1, -2));
            Drawable W0 = aob.W0(getContext(), R.drawable.greydivider_bottom, aob.b7);
            View ak4Var3 = new ak4(getContext(), 12, (byte) 1);
            ak4Var3.setBackground(W0);
            addView(ak4Var3, tre.o(-1, -2));
        }
    }
}
