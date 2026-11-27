// default package

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.time.LocalDate;
import j$.time.Period;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UserInfoActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wr8 extends c79 {
    public final Context c;
    public final HashMap d = new HashMap();
    public final /* synthetic */ ProfileActivity e;

    public wr8(ProfileActivity profileActivity, Context context) {
        this.e = profileActivity;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        int b = f89Var.b();
        ProfileActivity profileActivity = this.e;
        if (b == profileActivity.P2) {
            profileActivity.N2 = null;
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        ProfileActivity profileActivity = this.e;
        if (profileActivity.g3 != -1) {
            int b = f89Var.b();
            if (b != profileActivity.g3 && b != profileActivity.U2 && b != profileActivity.i3 && b != profileActivity.h3 && b != profileActivity.W2 && b != profileActivity.X2 && b != profileActivity.A3 && b != profileActivity.j3 && b != profileActivity.k3 && b != profileActivity.r3 && b != profileActivity.o3 && b != profileActivity.l3 && b != profileActivity.n3 && b != profileActivity.s3 && b != profileActivity.t3 && b != profileActivity.w3 && b != profileActivity.x3 && b != profileActivity.y3 && b != profileActivity.z3 && b != profileActivity.P2 && b != profileActivity.d4 && b != profileActivity.f4 && b != profileActivity.j4 && b != profileActivity.i4 && b != profileActivity.m3 && b != profileActivity.V2 && b != profileActivity.R2 && b != profileActivity.g4 && b != profileActivity.h4 && b != profileActivity.o4) {
                return false;
            }
        } else {
            View view = f89Var.a;
            if (view instanceof vac) {
                Object currentObject = ((vac) view).getCurrentObject();
                if ((currentObject instanceof TLRPC.User) && lbc.D((TLRPC.User) currentObject)) {
                    return false;
                }
            }
            int i = f89Var.f;
            if (i == 1 || i == 5 || i == 7 || i == 11 || i == 31 || i == 28 || i == 12 || i == 13 || i == 9 || i == 10 || i == 25 || i == 32) {
                return false;
            }
        }
        return true;
    }

    public final CharSequence E(String str, ArrayList arrayList, String str2) {
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int i = 0;
            while (i < arrayList2.size()) {
                if (!((TLRPC.TL_username) arrayList2.get(i)).active || (str != null && str.equals(((TLRPC.TL_username) arrayList2.get(i)).username))) {
                    arrayList2.remove(i);
                    i--;
                }
                i++;
            }
            if (arrayList2.size() > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    TLRPC.TL_username tL_username = (TLRPC.TL_username) arrayList2.get(i2);
                    SpannableString spannableString = new SpannableString(c00.i("@", tL_username.username));
                    HashMap hashMap = this.d;
                    ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                    if (clickableSpan == null) {
                        or8 or8Var = new or8(this, tL_username, tL_username.username);
                        hashMap.put(tL_username, or8Var);
                        clickableSpan = or8Var;
                    }
                    spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                    spannableString.setSpan(new ho4(aob.Xc, this.e.A0), 0, spannableString.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString);
                    if (i2 < arrayList2.size() - 1) {
                        spannableStringBuilder.append((CharSequence) ", ");
                    }
                }
                String M0 = ob6.M0(2131743323, null);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(M0);
                int indexOf = M0.indexOf("%1$s");
                if (indexOf >= 0) {
                    spannableStringBuilder2.replace(indexOf, indexOf + 4, (CharSequence) spannableStringBuilder);
                }
                return spannableStringBuilder2;
            }
        }
        return str2;
    }

    @Override // j79
    public final int b() {
        return this.e.O2;
    }

    @Override // j79
    public final int d(int i) {
        int i2;
        int i3;
        int i4;
        ProfileActivity profileActivity = this.e;
        if (i == profileActivity.E3 || i == profileActivity.w4 || i == profileActivity.f3 || i == profileActivity.T2 || i == profileActivity.q3 || i == profileActivity.v3 || i == profileActivity.q4) {
            return 1;
        }
        if (i == profileActivity.H3 || i == profileActivity.J3 || i == profileActivity.U2 || i == profileActivity.V2) {
            return 2;
        }
        if (i == profileActivity.M3 || i == profileActivity.W2) {
            return 19;
        }
        if (i == profileActivity.I3) {
            return 30;
        }
        if (i == profileActivity.K3 || i == profileActivity.L3 || i == profileActivity.X2) {
            return 3;
        }
        if (i == profileActivity.t4 || i == profileActivity.u4 || i == profileActivity.W3 || i == profileActivity.Y3 || i == profileActivity.X3 || i == profileActivity.A4 || i == profileActivity.B4 || i == profileActivity.C4 || i == profileActivity.D4 || i == profileActivity.J4 || i == profileActivity.z4 || i == profileActivity.P4 || i == profileActivity.O4 || i == profileActivity.V3 || i == profileActivity.g3 || i == profileActivity.i3 || i == profileActivity.h3 || i == profileActivity.j3 || i == profileActivity.k3 || i == profileActivity.r3 || i == profileActivity.o3 || i == profileActivity.l3 || i == profileActivity.n3 || i == profileActivity.s3 || i == profileActivity.t3 || i == profileActivity.w3 || i == profileActivity.x3 || i == profileActivity.y3 || i == profileActivity.z3 || i == profileActivity.P2 || i == profileActivity.d4 || i == profileActivity.b4 || i == profileActivity.a4 || i == profileActivity.m3 || i == profileActivity.j4 || i == profileActivity.i4 || i == profileActivity.E4 || i == profileActivity.F4 || i == profileActivity.G4) {
            return 4;
        }
        i2 = profileActivity.botPermissionLocation;
        if (i == i2) {
            return 4;
        }
        i3 = profileActivity.botPermissionBiometry;
        if (i == i3) {
            return 4;
        }
        i4 = profileActivity.botPermissionEmojiStatus;
        if (i == i4 || i == profileActivity.h4) {
            return 4;
        }
        if (i == profileActivity.N3) {
            return 5;
        }
        if (i == profileActivity.O3) {
            return 6;
        }
        if (i == profileActivity.R3) {
            return 20;
        }
        if (i == profileActivity.Q4 || i == profileActivity.K4 || i == profileActivity.p4 || i == profileActivity.v4 || i == profileActivity.e3 || i == profileActivity.p3 || i == profileActivity.u3 || i == profileActivity.Q2 || i == profileActivity.c3 || i == profileActivity.Y2 || i == profileActivity.k4 || i == profileActivity.Z3 || i == profileActivity.c4 || i == profileActivity.S2 || i == profileActivity.a3 || i == profileActivity.I4 || i == profileActivity.s4 || i == profileActivity.H4 || i == profileActivity.n4) {
            return 7;
        }
        if (i >= profileActivity.x4 && i < profileActivity.y4) {
            return 8;
        }
        if (i == profileActivity.B3) {
            return 11;
        }
        if (i == profileActivity.C3) {
            return 31;
        }
        if (i == profileActivity.D3) {
            return 12;
        }
        if (i == profileActivity.N4) {
            return 13;
        }
        if (i == profileActivity.A3) {
            return 14;
        }
        if (i == profileActivity.d3 || i == profileActivity.b3 || i == profileActivity.Z2) {
            return 15;
        }
        if (i == profileActivity.e4) {
            return 17;
        }
        if (i == profileActivity.f4) {
            return 18;
        }
        if (i == profileActivity.g4) {
            return 24;
        }
        if (i == profileActivity.Q3) {
            return 21;
        }
        if (i == profileActivity.P3) {
            return 22;
        }
        if (i == profileActivity.R2) {
            return 23;
        }
        if (i == profileActivity.l4) {
            return 25;
        }
        if (i == profileActivity.S3 || i == profileActivity.U3) {
            return 26;
        }
        if (i == profileActivity.m4) {
            return 32;
        }
        if (i == profileActivity.o4) {
            return 33;
        }
        if (i == profileActivity.T3) {
            return 27;
        }
        return (i == profileActivity.F3 || i == profileActivity.G3) ? 28 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:291:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:712:0x0fe6  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x1082  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x1096  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x1088  */
    @Override // j79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(f89 f89Var, int i) {
        int i2;
        String L0;
        CharSequence charSequence;
        String str;
        int i3;
        String str2;
        boolean z;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z2;
        TLRPC.TL_username tL_username;
        String str7;
        int i4;
        CharSequence h0;
        String L02;
        String str8;
        byte b;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z4;
        String L03;
        boolean z5;
        String str9;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        TL_payments.starRefProgram starrefprogram;
        TL_payments.starRefProgram starrefprogram2;
        TL_bots.BotVerification botVerification;
        TLRPC.User X1;
        TL_payments.starRefProgram starrefprogram3;
        TLRPC.User X12;
        int i18;
        int i19;
        ProfileActivity profileActivity = this.e;
        ArrayList arrayList = profileActivity.V4;
        HashSet hashSet = profileActivity.n5;
        int i20 = f89Var.f;
        View view = f89Var.a;
        String str10 = "";
        String str11 = null;
        r11 = null;
        String str12 = null;
        TLRPC.ChatParticipant chatParticipant = null;
        final byte b2 = 0;
        switch (i20) {
            case 1:
                mf5 mf5Var = (mf5) view;
                if (i == profileActivity.E3) {
                    if (!xc2.T(profileActivity.F2) || profileActivity.F2.megagroup || profileActivity.L3 == -1) {
                        mf5Var.setText(ob6.L0(2131748951));
                    } else {
                        mf5Var.setText(ob6.L0(2131745955));
                    }
                } else if (i == profileActivity.w4) {
                    mf5Var.setText(ob6.L0(2131752349));
                } else if (i == profileActivity.f3) {
                    mf5Var.setText(ob6.L0(2131745711));
                } else if (i == profileActivity.T2) {
                    mf5Var.setText(ob6.L0(2131754705));
                } else if (i == profileActivity.q3) {
                    mf5Var.setText(ob6.L0(2131745207));
                } else if (i == profileActivity.v3) {
                    mf5Var.setText(ob6.L0(2131745214));
                } else if (i == profileActivity.q4) {
                    mf5Var.setText(ob6.L0(2131752989));
                }
                int themedColor = profileActivity.getThemedColor(aob.L6);
                RectF rectF = ProfileActivity.Z6;
                mf5Var.setTextColor(themedColor);
                break;
            case 2:
            case 19:
            case jn7.S /* 30 */:
                clb clbVar = (clb) view;
                if (i == profileActivity.V2) {
                    TLRPC.UserFull Y1 = profileActivity.getMessagesController().Y1(profileActivity.e1);
                    if (Y1 != null && Y1.birthday != null) {
                        boolean d = pj0.d(Y1);
                        TL_account.TL_birthday tL_birthday = Y1.birthday;
                        boolean z12 = (tL_birthday.flags & 1) != 0;
                        int years = z12 ? Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears() : -1;
                        String c0 = UserInfoActivity.c0(Y1.birthday);
                        clbVar.c(pv3.p(z12 ? ob6.G(years, d ? "ProfileBirthdayTodayValueYear" : "ProfileBirthdayValueYear", c0) : ob6.Z(d ? 2131746450 : 2131746447, c0), clbVar.a, new l65((Object) this, (Object) f89Var, i, (byte) 27)), ob6.L0(d ? 2131746451 : 2131746453), (!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) ? false : true);
                        if (!profileActivity.s1 && d && !profileActivity.getMessagesController().N3()) {
                            b = 1;
                            z = false;
                            b2 = b;
                        }
                    }
                    b = 0;
                    z = false;
                    b2 = b;
                } else {
                    if (i == profileActivity.H3) {
                        TLRPC.User X13 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
                        if (X13 != null) {
                            if (!TextUtils.isEmpty(profileActivity.i5)) {
                                L02 = xnb.k(new StringBuilder("+"), profileActivity.i5, f78.f());
                                str8 = profileActivity.i5;
                            } else if (!TextUtils.isEmpty(X13.phone)) {
                                String k = xnb.k(new StringBuilder("+"), X13.phone, f78.f());
                                str8 = X13.phone;
                                L02 = k;
                            }
                            boolean z13 = str8 == null && str8.matches("888\\d{8}");
                            profileActivity.g5 = z13;
                            clbVar.c(L02, ob6.L0(!z13 ? 2131754244 : 2131747018), false);
                        }
                        L02 = ob6.L0(2131747021);
                        str8 = null;
                        if (str8 == null) {
                        }
                        profileActivity.g5 = z13;
                        clbVar.c(L02, ob6.L0(!z13 ? 2131754244 : 2131747018), false);
                    } else if (i == profileActivity.I3) {
                        TLRPC.UserFull Y12 = profileActivity.getMessagesController().Y1(profileActivity.e1);
                        if (Y12 != null) {
                            TLRPC.TL_textWithEntities tL_textWithEntities = Y12.note;
                            i4 = ((e) profileActivity).currentAccount;
                            if (yac.h(i4).p()) {
                                h0 = r47.h0(tL_textWithEntities, false);
                                if (!(h0 instanceof SpannableStringBuilder)) {
                                    h0 = new SpannableStringBuilder(h0);
                                }
                                hl.c((SpannableStringBuilder) h0, 1, false, false);
                            } else {
                                h0 = r47.h0(r47.w5(tL_textWithEntities), false);
                            }
                            clbVar.d(h0, ob6.L0(2131746377), ob6.L0(2131746376));
                        }
                    } else if (i == profileActivity.M3) {
                        ArrayList arrayList2 = new ArrayList();
                        if (profileActivity.e1 != 0) {
                            TLRPC.User X14 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
                            if (X14 != null) {
                                arrayList2.addAll(X14.usernames);
                                if (!TextUtils.isEmpty(X14.username)) {
                                    tL_username = wf3.b(X14.username, arrayList2);
                                    str5 = X14.username;
                                    ArrayList arrayList3 = X14 != null ? new ArrayList() : new ArrayList(X14.usernames);
                                    if (TextUtils.isEmpty(str5)) {
                                        int i21 = 0;
                                        while (true) {
                                            if (i21 < arrayList3.size()) {
                                                TLRPC.TL_username tL_username2 = (TLRPC.TL_username) arrayList3.get(i21);
                                                if (tL_username2 == null || !tL_username2.active || TextUtils.isEmpty(tL_username2.username)) {
                                                    i21++;
                                                } else {
                                                    str5 = tL_username2.username;
                                                    tL_username = tL_username2;
                                                }
                                            }
                                        }
                                    }
                                    String L04 = ob6.L0(2131743329);
                                    if (str5 == null) {
                                        String concat = "@".concat(str5);
                                        if (tL_username == null || tL_username.editable) {
                                            str7 = concat;
                                        } else {
                                            SpannableString spannableString = new SpannableString(concat);
                                            HashMap hashMap = this.d;
                                            ClickableSpan clickableSpan = (ClickableSpan) hashMap.get(tL_username);
                                            if (clickableSpan == null) {
                                                or8 or8Var = new or8(this, tL_username, tL_username.username);
                                                hashMap.put(tL_username, or8Var);
                                                clickableSpan = or8Var;
                                            }
                                            spannableString.setSpan(clickableSpan, 0, spannableString.length(), 33);
                                            str7 = spannableString;
                                        }
                                    } else {
                                        str7 = "—";
                                    }
                                    z = !profileActivity.s1;
                                    ArrayList arrayList4 = arrayList3;
                                    str3 = str7;
                                    arrayList2 = arrayList4;
                                    str4 = L04;
                                }
                            }
                            tL_username = null;
                            str5 = null;
                            if (X14 != null) {
                            }
                            if (TextUtils.isEmpty(str5)) {
                            }
                            String L042 = ob6.L0(2131743329);
                            if (str5 == null) {
                            }
                            z = !profileActivity.s1;
                            ArrayList arrayList42 = arrayList3;
                            str3 = str7;
                            arrayList2 = arrayList42;
                            str4 = L042;
                        } else if (profileActivity.F2 != null) {
                            TLRPC.Chat M0 = profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1));
                            String K = xc2.K(M0, false);
                            if (M0 != null) {
                                arrayList2.addAll(M0.usernames);
                            }
                            if (xc2.t0(M0)) {
                                z2 = !profileActivity.s1;
                                StringBuilder sb = new StringBuilder();
                                ik8.z(profileActivity.getMessagesController().N2, "/", K, sb);
                                String str13 = str10;
                                if (profileActivity.g1 != 0) {
                                    str13 = "/" + profileActivity.g1;
                                }
                                sb.append(str13);
                                str6 = sb.toString();
                                str4 = ob6.L0(2131748903);
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(profileActivity.getMessagesController().N2);
                                sb2.append("/c/");
                                sb2.append(profileActivity.f1);
                                String str14 = str10;
                                if (profileActivity.g1 != 0) {
                                    str14 = "/" + profileActivity.g1;
                                }
                                sb2.append(str14);
                                String sb3 = sb2.toString();
                                str4 = ob6.L0(2131748899);
                                str6 = sb3;
                                z2 = false;
                            }
                            str5 = K;
                            z = z2;
                            str3 = str6;
                        } else {
                            arrayList2 = new ArrayList();
                            z = false;
                            str3 = "";
                            str4 = str3;
                            str5 = null;
                        }
                        clbVar.c(str3, E(str5, arrayList2, str4), profileActivity.G3 == -1 && !(!profileActivity.q1 && profileActivity.P3 == -1 && profileActivity.Q3 == -1) && profileActivity.V2 < 0);
                    } else if (i == profileActivity.J3) {
                        TLRPC.ChatFull chatFull = profileActivity.v2;
                        if (chatFull != null) {
                            TLRPC.ChannelLocation channelLocation = chatFull.location;
                            if (channelLocation instanceof TLRPC.TL_channelLocation) {
                                clbVar.c(((TLRPC.TL_channelLocation) channelLocation).address, ob6.L0(2131753954), false);
                            }
                        }
                    } else if (i == profileActivity.U2) {
                        i3 = ((e) profileActivity).currentAccount;
                        TLRPC.User f = yac.h(i3).f();
                        clbVar.c((f == null || (str2 = f.phone) == null || str2.length() == 0) ? ob6.L0(2131747559) : xnb.k(new StringBuilder("+"), f.phone, f78.f()), ob6.L0(2131743913), true);
                        clbVar.setContentDescriptionValueFirst(false);
                    } else if (i == profileActivity.W2) {
                        i2 = ((e) profileActivity).currentAccount;
                        TLRPC.User f2 = yac.h(i2).f();
                        String L05 = ob6.L0(2131743329);
                        if (f2 == null || f2.usernames.size() <= 0) {
                            String p = lbc.p(f2);
                            if (f2 == null || TextUtils.isEmpty(p)) {
                                L0 = ob6.L0(2131743316);
                                charSequence = L05;
                            } else {
                                L0 = c00.i("@", p);
                                charSequence = L05;
                            }
                        } else {
                            int i22 = 0;
                            while (true) {
                                if (i22 < f2.usernames.size()) {
                                    TLRPC.TL_username tL_username3 = f2.usernames.get(i22);
                                    if (tL_username3 == null || !tL_username3.active || TextUtils.isEmpty(tL_username3.username)) {
                                        i22++;
                                    } else {
                                        str = tL_username3.username;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                str = f2.username;
                            }
                            L0 = (str == null || TextUtils.isEmpty(str)) ? ob6.L0(2131743316) : "@".concat(str);
                            charSequence = E(str, f2.usernames, L05);
                        }
                        clbVar.c(L0, charSequence, true);
                        clbVar.setContentDescriptionValueFirst(true);
                    }
                    z = false;
                }
                if (b2 != 0) {
                    Drawable drawable = clbVar.getContext().getDrawable(R.drawable.msg_input_gift);
                    int themedColor2 = profileActivity.getThemedColor(aob.V6);
                    RectF rectF2 = ProfileActivity.Z6;
                    drawable.setColorFilter(new PorterDuffColorFilter(themedColor2, PorterDuff.Mode.MULTIPLY));
                    profileActivity.U6 = drawable;
                    if (lbc.c(profileActivity.w2)) {
                        clbVar.setImage(null);
                        clbVar.setImageClickListener(null);
                    } else {
                        clbVar.b(drawable, ob6.L0(2131749469));
                        clbVar.setImageClickListener(new fp8(profileActivity, (byte) 12));
                    }
                } else if (z) {
                    Drawable drawable2 = clbVar.getContext().getDrawable(R.drawable.header_qr_24);
                    int themedColor3 = profileActivity.getThemedColor(aob.v8);
                    RectF rectF3 = ProfileActivity.Z6;
                    drawable2.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
                    profileActivity.V6 = drawable2;
                    clbVar.b(drawable2, ob6.L0(2131750433));
                    clbVar.setImageClickListener(new fp8(profileActivity, (byte) 12));
                } else {
                    clbVar.setImage(null);
                    clbVar.setImageClickListener(null);
                }
                clbVar.setTag(Integer.valueOf(i));
                clbVar.a.setLoading(profileActivity.o5);
                clbVar.b.setLoading(profileActivity.o5);
                break;
            case 3:
                t1 t1Var = (t1) view;
                if (i == profileActivity.K3) {
                    TLRPC.User user = profileActivity.w2.user;
                    if (user == null) {
                        user = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.w2.id));
                    }
                    t1Var.f(profileActivity.w2.about, ob6.L0(2131743420), profileActivity.s2 || !(user == null || !user.premium || profileActivity.w2.about == null));
                    break;
                } else if (i == profileActivity.L3) {
                    String str15 = profileActivity.v2.about;
                    while (str15.contains("\n\n\n")) {
                        str15 = str15.replace("\n\n\n", "\n\n");
                    }
                    t1Var.f(str15, ob6.L0(2131751424), xc2.T(profileActivity.F2) && !profileActivity.F2.megagroup);
                    break;
                } else if (i == profileActivity.X2) {
                    TLRPC.UserFull userFull = profileActivity.w2;
                    if (userFull == null || !TextUtils.isEmpty(userFull.about)) {
                        TLRPC.UserFull userFull2 = profileActivity.w2;
                        t1Var.f(userFull2 == null ? ob6.L0(2131748533) : userFull2.about, ob6.L0(2131743420), profileActivity.getUserConfig().p());
                        TLRPC.UserFull userFull3 = profileActivity.w2;
                        profileActivity.A2 = userFull3 != null ? userFull3.about : null;
                    } else {
                        t1Var.f(ob6.L0(2131743420), ob6.L0(2131743419), false);
                        profileActivity.A2 = null;
                    }
                    t1Var.setMoreButtonDisabled(true);
                    break;
                }
                break;
            case 4:
            case 18:
            case 24:
                skb skbVar = (skb) view;
                int i23 = aob.m6;
                int i24 = aob.G6;
                skbVar.g(i23, i24);
                skbVar.setTag(Integer.valueOf(i24));
                if (i == profileActivity.t4) {
                    int i25 = profileActivity.getMessagesController().a1(Integer.valueOf(wf3.h(profileActivity.i1))).ttl;
                    skbVar.q(ob6.L0(2131748341), i25 == 0 ? ob6.L0(2131745089) : ob6.c0(i25), false, false);
                } else if (i == profileActivity.O4) {
                    skbVar.k(ob6.L0(2131743566), false);
                    skbVar.g(-1, aob.p7);
                } else if (i == profileActivity.u4) {
                    bm5 bm5Var = new bm5();
                    TLRPC.EncryptedChat a1 = profileActivity.getMessagesController().a1(Integer.valueOf(wf3.h(profileActivity.i1)));
                    byte[] bArr = a1.key_hash;
                    bm5Var.a = bArr;
                    if (bArr == null) {
                        byte[] bArr2 = a1.auth_key;
                        Typeface typeface = hl.a;
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                        bm5Var.a = bArr3;
                        a1.key_hash = bArr3;
                    }
                    bm5Var.invalidateSelf();
                    skbVar.v(ob6.L0(2131751097), bm5Var, false);
                } else if (i == profileActivity.P4) {
                    skbVar.g(-1, aob.o6);
                    if (profileActivity.F2.megagroup) {
                        skbVar.k(ob6.L0(2131746388), false);
                    } else {
                        skbVar.k(ob6.L0(2131746389), false);
                    }
                } else if (i == profileActivity.A4) {
                    TLRPC.ChatFull chatFull2 = profileActivity.v2;
                    TLRPC.Chat chat = profileActivity.F2;
                    if (chatFull2 != null) {
                        if (!xc2.T(chat) || profileActivity.F2.megagroup) {
                            skbVar.s(ob6.L0(2131752349), ob6.E(profileActivity.v2.participants_count, ','), R.drawable.msg_groups, i != profileActivity.K4 + (-1));
                        } else {
                            skbVar.s(ob6.L0(2131752255), ob6.E(profileActivity.v2.participants_count, ','), R.drawable.msg_groups, i != profileActivity.K4 + (-1));
                        }
                    } else if (!xc2.T(chat) || profileActivity.F2.megagroup) {
                        skbVar.o(R.drawable.msg_groups, ob6.L0(2131752349), i != profileActivity.K4 + (-1));
                    } else {
                        skbVar.o(R.drawable.msg_groups, ob6.L0(2131752255), i != profileActivity.K4 + (-1));
                    }
                } else if (i == profileActivity.B4) {
                    if (profileActivity.v2 != null) {
                        skbVar.s(ob6.L0(2131744089), String.format("%d", Integer.valueOf(profileActivity.v2.requests_pending)), R.drawable.msg_requests, i != profileActivity.K4 - 1);
                    }
                } else if (i == profileActivity.C4) {
                    if (profileActivity.v2 != null) {
                        skbVar.s(ob6.L0(2131752492), String.format("%d", Integer.valueOf(profileActivity.v2.admins_count)), R.drawable.msg_admins, i != profileActivity.K4 - 1);
                    } else {
                        skbVar.o(R.drawable.msg_admins, ob6.L0(2131752492), i != profileActivity.K4 - 1);
                    }
                } else if (i == profileActivity.D4) {
                    skbVar.o(R.drawable.msg_customize, ob6.L0(2131752494), i != profileActivity.K4 - 1);
                } else if (i == profileActivity.G4) {
                    i15 = ((e) profileActivity).currentAccount;
                    TL_stars.StarsAmount c = kt0.g(i15).c(-profileActivity.f1);
                    i16 = ((e) profileActivity).currentAccount;
                    long i26 = kt0.g(i16).i(-profileActivity.f1);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i26 > 0) {
                        double d2 = i26 / 1.0E9d;
                        if (d2 > 1000.0d) {
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) hl.o0((int) d2, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols.setDecimalSeparator('.');
                            DecimalFormat decimalFormat = new DecimalFormat("#.##", decimalFormatSymbols);
                            decimalFormat.setMinimumFractionDigits(2);
                            decimalFormat.setMaximumFractionDigits(3);
                            decimalFormat.setGroupingUsed(false);
                            spannableStringBuilder.append((CharSequence) "TON ").append((CharSequence) decimalFormat.format(d2));
                        }
                    }
                    if (c.amount > 0) {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        spannableStringBuilder.append((CharSequence) "XTR ").append((CharSequence) nza.I0(c, 0.777f, ' '));
                    }
                    skbVar.s(ob6.L0(2131752256), ij1.L(nza.b1(false, spannableStringBuilder, 0.7f, null), skbVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_feature_paid, true);
                } else if (i == profileActivity.E4) {
                    i14 = ((e) profileActivity).currentAccount;
                    TL_stars.StarsAmount c2 = kt0.g(i14).c(profileActivity.e1);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (c2.amount > 0) {
                        spannableStringBuilder2.append((CharSequence) "XTR ").append((CharSequence) nza.I0(c2, 0.777f, ' '));
                    }
                    skbVar.s(ob6.L0(2131753104), ij1.L(nza.b1(false, spannableStringBuilder2, 0.7f, null), skbVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.menu_premium_main, true);
                } else if (i == profileActivity.F4) {
                    i13 = ((e) profileActivity).currentAccount;
                    long i27 = kt0.g(i13).i(profileActivity.e1);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                    if (i27 > 0) {
                        double d3 = i27 / 1.0E9d;
                        if (d3 > 1000.0d) {
                            spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) hl.o0((int) d3, 0));
                        } else {
                            DecimalFormatSymbols decimalFormatSymbols2 = new DecimalFormatSymbols(Locale.US);
                            decimalFormatSymbols2.setDecimalSeparator('.');
                            DecimalFormat decimalFormat2 = new DecimalFormat("#.##", decimalFormatSymbols2);
                            decimalFormat2.setMinimumFractionDigits(2);
                            decimalFormat2.setMaximumFractionDigits(3);
                            decimalFormat2.setGroupingUsed(false);
                            spannableStringBuilder3.append((CharSequence) "TON ").append((CharSequence) decimalFormat2.format(d3));
                        }
                    }
                    skbVar.s(ob6.L0(2131753103), ij1.L(nza.b1(false, spannableStringBuilder3, 0.7f, null), skbVar.getTextView().getPaint(), 1.0f, 0.0f, true), R.drawable.outline_gram_24, true);
                } else if (i == profileActivity.J4) {
                    if (profileActivity.v2 != null) {
                        String L06 = ob6.L0(2131752427);
                        TLRPC.ChatFull chatFull3 = profileActivity.v2;
                        skbVar.s(L06, String.format("%d", Integer.valueOf(Math.max(chatFull3.banned_count, chatFull3.kicked_count))), R.drawable.msg_user_remove, i != profileActivity.K4 - 1);
                    } else {
                        skbVar.o(R.drawable.msg_user_remove, ob6.L0(2131752427), i != profileActivity.K4 - 1);
                    }
                } else if (i == profileActivity.z4) {
                    skbVar.g(i23, i24);
                    int i28 = i + 1;
                    skbVar.o(R.drawable.msg_contact_add, ob6.L0(2131754394), profileActivity.K4 == -1 || (i28 >= profileActivity.x4 && i28 < profileActivity.y4));
                } else if (i == profileActivity.V3) {
                    skbVar.k(ob6.L0(2131745327), true);
                } else if (i == profileActivity.a4) {
                    skbVar.o(R.drawable.msg_contact_add, ob6.L0(2131754370), false);
                    skbVar.g(i23, i24);
                } else if (i == profileActivity.X3) {
                    skbVar.o(R.drawable.menu_reaction_delete_24, ob6.L0(2131751472), false);
                    skbVar.g(aob.q7, aob.p7);
                } else if (i == profileActivity.Y3) {
                    TLRPC.Chat M02 = profileActivity.getMessagesController().M0(Long.valueOf(-profileActivity.f5));
                    if (M02 == null || !xc2.w(2, M02)) {
                        skbVar.o(R.drawable.msg_report, ob6.L0(2131745938), false);
                    } else {
                        skbVar.o(R.drawable.msg_block2, ob6.L0(2131745937), false);
                    }
                    skbVar.g(aob.q7, aob.p7);
                } else if (i == profileActivity.W3) {
                    skbVar.k(ob6.L0(2131745913), false);
                    int i29 = aob.p7;
                    skbVar.g(-1, i29);
                    skbVar.g(-1, i29);
                } else if (i == profileActivity.h3) {
                    skbVar.u(ob6.L0(2131748808), ob6.j0(), false, R.drawable.msg2_language, false);
                    skbVar.setImageLeft(23);
                } else if (i == profileActivity.g3) {
                    skbVar.o(R.drawable.msg2_notifications, ob6.L0(2131747649), true);
                } else if (i == profileActivity.i3) {
                    skbVar.o(R.drawable.msg2_secret, ob6.L0(2131746500), true);
                } else if (i == profileActivity.j3) {
                    skbVar.o(R.drawable.msg2_data, ob6.L0(2131751642), true);
                } else if (i == profileActivity.k3) {
                    skbVar.o(R.drawable.msg2_discussion, ob6.L0(2131752175), true);
                } else if (i == profileActivity.l3) {
                    skbVar.o(R.drawable.msg2_folder, ob6.L0(2131750656), true);
                } else if (i == profileActivity.n3) {
                    skbVar.o(R.drawable.msg2_sticker, ob6.L0(2131744514), true);
                } else if (i == profileActivity.m3) {
                    skbVar.o(R.drawable.msg2_battery, ob6.L0(2131746795), true);
                } else if (i == profileActivity.r3) {
                    skbVar.o(R.drawable.msg2_ask_question, ob6.L0(2131753979), true);
                } else if (i == profileActivity.s3) {
                    skbVar.o(R.drawable.msg2_help, ob6.L0(2131743895), true);
                } else if (i == profileActivity.t3) {
                    skbVar.o(R.drawable.msg2_policy, ob6.L0(2131746512), false);
                } else if (i == profileActivity.w3) {
                    skbVar.k(ob6.L0(2131751578), true);
                } else if (i == profileActivity.x3) {
                    skbVar.k(ob6.L0(2131751579), true);
                } else if (i == profileActivity.y3) {
                    skbVar.k(ob6.L0(2131751615), profileActivity.z3 != -1);
                } else if (i == profileActivity.z3) {
                    skbVar.k("Switch Backend", false);
                } else if (i == profileActivity.o3) {
                    skbVar.o(R.drawable.msg2_devices, ob6.L0(2131751420), true);
                } else if (i == profileActivity.P2) {
                    profileActivity.W.K(86);
                    profileActivity.W.G();
                    skbVar.p(ob6.L0(2131745244), profileActivity.W, false);
                    skbVar.g(aob.v6, aob.u6);
                    skbVar.getImageView().setPadding(0, 0, 0, hl.L(8.0f));
                    skbVar.setImageLeft(12);
                    profileActivity.N2 = skbVar;
                } else if (i == profileActivity.b4) {
                    skbVar.o(R.drawable.msg_contact_add, ob6.L0(2131753044), false);
                    skbVar.g(aob.v6, aob.u6);
                } else if (i == profileActivity.d4) {
                    skbVar.o(R.drawable.msg_groups_create, ob6.L0(2131754365), false);
                } else if (i == profileActivity.f4) {
                    skbVar.p(ob6.L0(2131743884), new vl(hl.L(24.0f), hl.L(24.0f), bl8.d().f), true);
                    skbVar.setImageLeft(23);
                } else if (i == profileActivity.g4) {
                    i12 = ((e) profileActivity).currentAccount;
                    jxa t = jxa.t(i12);
                    long j = t.m().amount;
                    String L07 = ob6.L0(2131748358);
                    CharSequence charSequence2 = str10;
                    if (t.e) {
                        charSequence2 = str10;
                        if (j > 0) {
                            charSequence2 = nza.H0(t.m(), 0.85f, ' ');
                        }
                    }
                    skbVar.t(L07, charSequence2, new vl(hl.L(24.0f), hl.L(24.0f), bl8.d().h), true);
                    skbVar.setImageLeft(23);
                } else if (i == profileActivity.h4) {
                    i11 = ((e) profileActivity).currentAccount;
                    jxa I = jxa.I(i11);
                    long j2 = I.m().amount;
                    String L08 = ob6.L0(2131748054);
                    CharSequence charSequence3 = str10;
                    if (I.e) {
                        charSequence3 = str10;
                        if (j2 > 0) {
                            charSequence3 = nza.H0(I.m(), 0.85f, ' ');
                        }
                    }
                    skbVar.s(L08, charSequence3, R.drawable.settings_gram_24, true);
                    skbVar.setImageLeft(23);
                } else if (i == profileActivity.i4) {
                    skbVar.o(R.drawable.menu_shop, ob6.L0(2131743905), true);
                    skbVar.setImageLeft(23);
                } else if (i == profileActivity.j4) {
                    skbVar.o(R.drawable.menu_gift, ob6.L0(2131745367), false);
                    skbVar.setImageLeft(23);
                } else {
                    i5 = profileActivity.botPermissionLocation;
                    if (i == i5) {
                        String L09 = ob6.L0(2131752990);
                        tq0 tq0Var = profileActivity.t2;
                        boolean z14 = tq0Var != null && tq0Var.f();
                        int themedColor4 = profileActivity.getThemedColor(aob.lk);
                        i10 = profileActivity.botPermissionBiometry;
                        skbVar.m(L09, z14, R.drawable.filled_access_location, themedColor4, i10 != -1);
                    } else {
                        i6 = profileActivity.botPermissionBiometry;
                        if (i == i6) {
                            String L010 = ob6.L0(2131752992);
                            uo0 uo0Var = profileActivity.u2;
                            skbVar.m(L010, uo0Var != null && uo0Var.e, R.drawable.filled_access_fingerprint, profileActivity.getThemedColor(aob.ok), false);
                        } else {
                            i7 = profileActivity.botPermissionEmojiStatus;
                            if (i == i7) {
                                String L011 = ob6.L0(2131752991);
                                TLRPC.UserFull userFull4 = profileActivity.w2;
                                boolean z15 = userFull4 != null && userFull4.bot_can_manage_emoji_status;
                                int themedColor5 = profileActivity.getThemedColor(aob.jk);
                                i8 = profileActivity.botPermissionLocation;
                                if (i8 == -1) {
                                    i9 = profileActivity.botPermissionBiometry;
                                    if (i9 == -1) {
                                        z3 = false;
                                        skbVar.m(L011, z15, R.drawable.filled_access_sleeping, themedColor5, z3);
                                    }
                                }
                                z3 = true;
                                skbVar.m(L011, z15, R.drawable.filled_access_sleeping, themedColor5, z3);
                            }
                        }
                    }
                }
                yob.U(skbVar.c, aob.I6, profileActivity.A0);
                break;
            case 6:
                uo7 uo7Var = (uo7) view;
                if (i == profileActivity.O3) {
                    i17 = ((e) profileActivity).currentAccount;
                    SharedPreferences w1 = uc7.w1(i17);
                    long j3 = profileActivity.i1;
                    if (j3 == 0) {
                        j3 = profileActivity.e1;
                        if (j3 == 0) {
                            j3 = -profileActivity.f1;
                        }
                    }
                    String p2 = ip7.p(j3, profileActivity.g1, false);
                    boolean z16 = w1.getBoolean("custom_" + p2, false);
                    boolean contains = w1.contains("notify2_" + p2);
                    int g = qu6.g("notify2_", p2, w1, 0);
                    int g2 = qu6.g("notifyuntil_", p2, w1, 0);
                    if (g == 3 && g2 != Integer.MAX_VALUE) {
                        int currentTime = g2 - profileActivity.getConnectionsManager().getCurrentTime();
                        if (currentTime <= 0) {
                            str11 = z16 ? ob6.L0(2131747645) : ob6.L0(2131747619);
                            z5 = true;
                        } else {
                            if (currentTime < 3600) {
                                str11 = ob6.Y(2131742496, "WillUnmuteIn", ob6.G(currentTime / 60, "Minutes", new Object[0]));
                            } else if (currentTime < 86400) {
                                str11 = ob6.Y(2131742496, "WillUnmuteIn", ob6.G((int) Math.ceil((currentTime / 60.0f) / 60.0f), "Hours", new Object[0]));
                            } else if (currentTime < 31536000) {
                                str11 = ob6.Y(2131742496, "WillUnmuteIn", ob6.G((int) Math.ceil(((currentTime / 60.0f) / 60.0f) / 24.0f), "Days", new Object[0]));
                            }
                            z5 = false;
                        }
                    } else if (g == 0) {
                        if (!contains) {
                            z4 = profileActivity.getNotificationsController().w(j3);
                            if (z4) {
                                L03 = ob6.L0(2131747621);
                            } else if (z16) {
                                str11 = ob6.L0(2131747645);
                                z5 = z4;
                            } else {
                                L03 = ob6.L0(2131747619);
                            }
                            str11 = L03;
                            z5 = z4;
                        }
                        z4 = true;
                        if (z4) {
                        }
                        str11 = L03;
                        z5 = z4;
                    } else {
                        if (g != 1) {
                            z4 = false;
                            if (z4) {
                            }
                            str11 = L03;
                            z5 = z4;
                        }
                        z4 = true;
                        if (z4) {
                        }
                        str11 = L03;
                        z5 = z4;
                    }
                    if (str11 == null) {
                        str11 = ob6.L0(2131747621);
                    }
                    if (hashSet != null && !hashSet.isEmpty()) {
                        str11 = String.format(Locale.US, ob6.J0(hashSet.size(), "NotificationTopicExceptionsDesctription"), str11, Integer.valueOf(hashSet.size()));
                    }
                    String str16 = str11;
                    uo7Var.setAnimationsEnabled(profileActivity.r5);
                    uo7Var.b(ob6.L0(2131747651), str16, 0, z5, 0, false, profileActivity.l4 >= 0, false);
                    break;
                }
                break;
            case 7:
                view.setTag(Integer.valueOf(i));
                break;
            case 8:
                vac vacVar = (vac) view;
                try {
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList5 = profileActivity.U4;
                    chatParticipant = !isEmpty ? (TLRPC.ChatParticipant) arrayList5.get(((Integer) arrayList.get(i - profileActivity.x4)).intValue()) : (TLRPC.ChatParticipant) arrayList5.get(i - profileActivity.x4);
                } catch (Exception e) {
                    cc4.f(e);
                }
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        String str17 = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(str17)) {
                                str17 = ob6.L0(2131752397);
                            }
                            z9 = false;
                            z10 = true;
                            z11 = true;
                        } else if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                            if (TextUtils.isEmpty(str17)) {
                                str17 = ob6.L0(2131752495);
                            }
                            z9 = channelParticipant.promoted_by == profileActivity.getUserConfig().e();
                            z11 = false;
                            z10 = true;
                        } else {
                            z9 = false;
                            z10 = false;
                            z11 = false;
                        }
                        z6 = z9;
                        z7 = z10;
                        z8 = z11;
                        str9 = str17;
                    } else {
                        String str18 = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(str18)) {
                                str18 = ob6.L0(2131752397);
                            }
                            str9 = str18;
                            z6 = false;
                            z7 = true;
                            z8 = true;
                        } else if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                            if (TextUtils.isEmpty(str18)) {
                                str18 = ob6.L0(2131752495);
                            }
                            z6 = chatParticipant.inviter_id == profileActivity.getUserConfig().e();
                            str9 = str18;
                            z8 = false;
                            z7 = true;
                        } else {
                            str9 = str18;
                            z6 = false;
                            z7 = false;
                            z8 = false;
                        }
                    }
                    TLRPC.User X15 = profileActivity.getMessagesController().X1(Long.valueOf(chatParticipant.user_id));
                    vacVar.a(str9, z7, z8, lbc.D(X15) && xc2.h(profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.f1))), new rs5(this, X15, str9, z7, z8, z6, (byte) 1));
                    vacVar.e(X15, i != profileActivity.y4 + (-1));
                    break;
                }
                break;
            case 12:
                view.requestLayout();
                break;
            case 15:
                gca gcaVar = (gca) view;
                if (i == profileActivity.d3) {
                    gcaVar.setType(1);
                    break;
                } else if (i == profileActivity.b3) {
                    gcaVar.setType(0);
                    break;
                } else if (i == profileActivity.Z2) {
                    gcaVar.setType(2);
                    break;
                }
                break;
            case 17:
                ((ilb) view).setText(ob6.L0(2131753147));
                break;
            case 20:
                ((wkb) view).f(ob6.L0(2131747651), !profileActivity.getMessagesController().o2(profileActivity.a(), profileActivity.g1), false);
                break;
            case 21:
                qu8 qu8Var = (qu8) view;
                TLRPC.UserFull userFull5 = profileActivity.w2;
                qu8Var.a(userFull5 != null ? userFull5.business_location : null, profileActivity.N3 < 0 && !profileActivity.s1);
                break;
            case 22:
                lu8 lu8Var = (lu8) view;
                lu8Var.setOnTimezoneSwitchClick(new kr8(this, (byte) 1));
                TLRPC.UserFull userFull6 = profileActivity.w2;
                lu8Var.a(userFull6 != null ? userFull6.business_work_hours : null, profileActivity.R4, profileActivity.S4, (profileActivity.N3 < 0 && !profileActivity.s1) || profileActivity.Q3 >= 0);
                break;
            case 23:
                us8 us8Var = (us8) view;
                TLRPC.Chat M03 = profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.w2.personal_channel_id));
                ts8 ts8Var = profileActivity.x2;
                us8Var.a(ts8Var != null ? ts8Var.d : null, M03);
                break;
            case 26:
                ilb ilbVar = (ilb) view;
                ilbVar.setLinkTextRippleColor(null);
                if (i == profileActivity.S3) {
                    profileActivity.getMessagesController().b2(profileActivity.a());
                    TLRPC.UserFull userFull7 = profileActivity.w2;
                    if (userFull7 != null) {
                        botVerification = userFull7.bot_verification;
                    } else {
                        TLRPC.ChatFull chatFull4 = profileActivity.v2;
                        botVerification = chatFull4 != null ? chatFull4.bot_verification : null;
                    }
                    Long valueOf = (userFull7 == null || !TLObject.hasFlag(userFull7.flags2, 33554432)) ? null : Long.valueOf(profileActivity.w2.bot_manager_id);
                    TLRPC.UserFull userFull8 = profileActivity.w2;
                    TLRPC.PeerSettings peerSettings = userFull8 != null ? userFull8.settings : null;
                    TLRPC.User X16 = (peerSettings == null || peerSettings.bot_inviter_id == 0) ? null : profileActivity.getMessagesController().X1(Long.valueOf(peerSettings.bot_inviter_id));
                    TLRPC.User X17 = (peerSettings == null || peerSettings.bot_owner_id == 0) ? null : profileActivity.getMessagesController().X1(Long.valueOf(peerSettings.bot_owner_id));
                    if (profileActivity.l4 >= 0 || botVerification != null || valueOf != null || X16 != null || X17 != null) {
                        ilbVar.setFixedSize(0);
                        TLRPC.User X18 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
                        boolean z17 = X18 != null && X18.bot && X18.bot_can_edit;
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                        if (profileActivity.l4 >= 0) {
                            spannableStringBuilder4.append(hl.P2(ob6.L0(z17 ? 2131746432 : 2131746434), new q38((byte) 4, (Object) this, z17)));
                            if (botVerification != null || valueOf != null) {
                                spannableStringBuilder4.append("\n\n\n");
                            }
                        }
                        if (botVerification != null) {
                            spannableStringBuilder4.append("x");
                            spannableStringBuilder4.setSpan(new hm(botVerification.icon, ilbVar.getTextView().getPaint().getFontMetricsInt()), spannableStringBuilder4.length() - 1, spannableStringBuilder4.length(), 33);
                            spannableStringBuilder4.append(" ");
                            SpannableString spannableString2 = new SpannableString(r47.h0(botVerification.description, false));
                            try {
                                hl.c(spannableString2, 1, false, false);
                                for (URLSpan uRLSpan : (URLSpan[]) spannableString2.getSpans(0, spannableString2.length(), URLSpan.class)) {
                                    int spanStart = spannableString2.getSpanStart(uRLSpan);
                                    int spanEnd = spannableString2.getSpanEnd(uRLSpan);
                                    String url = uRLSpan.getURL();
                                    spannableString2.removeSpan(uRLSpan);
                                    spannableString2.setSpan(new nr8(this, url, url), spanStart, spanEnd, 33);
                                }
                            } catch (Exception e2) {
                                cc4.f(e2);
                            }
                            spannableStringBuilder4.append((CharSequence) spannableString2);
                        } else if (valueOf != null && (X1 = profileActivity.getMessagesController().X1(valueOf)) != null) {
                            int length = spannableStringBuilder4.length();
                            spannableStringBuilder4.append("</>");
                            spannableStringBuilder4.setSpan(new wm2(R.drawable.managed_bot), length, spannableStringBuilder4.length(), 33);
                            spannableStringBuilder4.append(" ");
                            spannableStringBuilder4.append(hl.M2(ob6.Z(2131746436, lbc.p(X1)), aob.Xc, profileActivity.A0, new hp8(this, valueOf, (byte) 10), false));
                        }
                        if (X16 != null || X17 != null) {
                            if (spannableStringBuilder4.length() > 0) {
                                spannableStringBuilder4.append("\n\n");
                            }
                            if (X16 != null) {
                                final long j4 = X16.id;
                                spannableStringBuilder4.append(hl.M2(ob6.Z(2131746439, lbc.r(X16)), aob.Xc, profileActivity.A0, new Runnable(this) { // from class: lr8
                                    public final /* synthetic */ wr8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b3 = b2;
                                        long j5 = j4;
                                        wr8 wr8Var = this.b;
                                        switch (b3) {
                                            case 0:
                                                wr8Var.e.presentFragment(ProfileActivity.Q2(j5));
                                                break;
                                            default:
                                                wr8Var.e.presentFragment(ProfileActivity.Q2(j5));
                                                break;
                                        }
                                    }
                                }, false));
                            }
                            if (X17 != null) {
                                if (X16 != null) {
                                    spannableStringBuilder4.append("\n");
                                }
                                final long j5 = X17.id;
                                final byte b3 = 1;
                                spannableStringBuilder4.append(hl.M2(ob6.Z(2131746440, lbc.r(X17)), aob.Xc, profileActivity.A0, new Runnable(this) { // from class: lr8
                                    public final /* synthetic */ wr8 b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        long j52 = j5;
                                        wr8 wr8Var = this.b;
                                        switch (b32) {
                                            case 0:
                                                wr8Var.e.presentFragment(ProfileActivity.Q2(j52));
                                                break;
                                            default:
                                                wr8Var.e.presentFragment(ProfileActivity.Q2(j52));
                                                break;
                                        }
                                    }
                                }, false));
                            }
                        }
                        ilbVar.setLinkTextRippleColor(Integer.valueOf(aob.p1(0.2f, profileActivity.getThemedColor(aob.B6))));
                        ilbVar.setText(spannableStringBuilder4);
                        break;
                    } else {
                        ilbVar.setFixedSize(14);
                        ilbVar.setText(null);
                        break;
                    }
                } else if (i == profileActivity.U3) {
                    TLRPC.User X19 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1));
                    if (X19 == null || !X19.bot || !X19.bot_can_edit) {
                        ilbVar.setFixedSize(0);
                        String r = lbc.r(X19);
                        TLRPC.UserFull userFull9 = profileActivity.w2;
                        ilbVar.setText(ob6.Z(2131746442, r, cc.J0((userFull9 == null || (starrefprogram = userFull9.starref_program) == null) ? 0 : starrefprogram.commission_permille)));
                        break;
                    } else {
                        ilbVar.setFixedSize(0);
                        String r2 = lbc.r(X19);
                        TLRPC.UserFull userFull10 = profileActivity.w2;
                        ilbVar.setText(ob6.Z(2131746441, r2, cc.J0((userFull10 == null || (starrefprogram2 = userFull10.starref_program) == null) ? 0 : starrefprogram2.commission_permille)));
                        break;
                    }
                }
                break;
            case 27:
                zb zbVar = (zb) view;
                zbVar.a(profileActivity.getThemedColor(aob.lk), R.drawable.filled_affiliate, ob6.L0(2131746443), null);
                TLRPC.UserFull userFull11 = profileActivity.w2;
                if (userFull11 != null && (starrefprogram3 = userFull11.starref_program) != null) {
                    str12 = cc.J0(starrefprogram3.commission_permille);
                }
                zbVar.setPercent(str12);
                break;
            case 32:
                TextView textView = (TextView) view;
                textView.setPadding(hl.L(16.0f), hl.L(10.0f), hl.L(16.0f), hl.L(10.0f));
                if (i == profileActivity.m4) {
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder("⚠️");
                    wm2 wm2Var = new wm2(R.drawable.round_warn);
                    wm2Var.d(hl.L(1.0f));
                    wm2Var.y = aob.v0(aob.nk, profileActivity.A0);
                    profileActivity.X6 = wm2Var;
                    spannableStringBuilder5.setSpan(wm2Var, 0, spannableStringBuilder5.length(), 33);
                    spannableStringBuilder5.append((CharSequence) " ");
                    spannableStringBuilder5.append((CharSequence) ob6.Z(2131746348, lbc.l(profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1)))));
                    textView.setText(spannableStringBuilder5);
                    break;
                }
                break;
            case 33:
                ao2 ao2Var = (ao2) view;
                if (profileActivity.F2 != null) {
                    i19 = ((e) profileActivity).currentAccount;
                    ao2Var.a(i19, profileActivity.getMessagesController().M0(Long.valueOf(profileActivity.F2.linked_community_id)));
                    break;
                } else if (profileActivity.e1 != 0 && (X12 = profileActivity.getMessagesController().X1(Long.valueOf(profileActivity.e1))) != null) {
                    i18 = ((e) profileActivity).currentAccount;
                    ao2Var.a(i18, profileActivity.getMessagesController().M0(Long.valueOf(X12.linked_community_id)));
                    break;
                }
                break;
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View mf5Var;
        View view;
        View sr8Var;
        View view2;
        byte b = 0;
        Context context = this.c;
        ProfileActivity profileActivity = this.e;
        switch (i) {
            case 1:
                mf5Var = new mf5(this.c, aob.L6, 18, 7, false, profileActivity.A0);
                break;
            case 2:
            case 19:
            case jn7.S /* 30 */:
                pr8 pr8Var = new pr8(18, profileActivity.A0, this.c, i == 30, i == 19);
                pr8Var.setContentDescriptionValueFirst(true);
                view = pr8Var;
                mf5Var = view;
                break;
            case 3:
                qr8 qr8Var = new qr8(this, context, profileActivity, profileActivity.A0);
                profileActivity.j6 = qr8Var;
                view2 = qr8Var;
                mf5Var = view2;
                break;
            case 4:
                view2 = new e92(this, context, profileActivity.A0);
                mf5Var = view2;
                break;
            case 5:
                View hp3Var = new hp3(context, profileActivity.A0);
                hp3Var.setPadding(hl.L(20.0f), hl.L(4.0f), 0, 0);
                mf5Var = hp3Var;
                break;
            case 6:
                mf5Var = new rr8(context, 18, 70, false, profileActivity.A0);
                break;
            case 7:
                mf5Var = new rca(context, (uh9) null);
                break;
            case 8:
                view = new vac(profileActivity.z4 == -1 ? 9 : 6, 0, profileActivity.A0, this.c, true, false);
                mf5Var = view;
                break;
            case 9:
            case 10:
            case 14:
            case 16:
            case 29:
            default:
                ilb ilbVar = new ilb(10, profileActivity.A0, context);
                ilbVar.getTextView().setGravity(1);
                yob.X(ilbVar.getTextView(), aob.A6, profileActivity.A0);
                ilbVar.getTextView().setMovementMethod(null);
                ilbVar.setText(hl.C0());
                ilbVar.getTextView().setPadding(0, hl.L(14.0f), 0, hl.L(14.0f));
                mf5Var = ilbVar;
                break;
            case 11:
            case 31:
                sr8Var = new sr8(context, hl.L(i == 31 ? 12.0f : 6.0f));
                sr8Var.setTag(-33024);
                mf5Var = sr8Var;
                break;
            case 12:
                sr8Var = new tr8(this, context);
                sr8Var.setBackground(new ColorDrawable(0));
                sr8Var.setTag(-33024);
                mf5Var = sr8Var;
                break;
            case 13:
                if (profileActivity.O.getParent() != null) {
                    ((ViewGroup) profileActivity.O.getParent()).removeView(profileActivity.O);
                }
                View view3 = profileActivity.O;
                view3.setTag(-33024);
                mf5Var = view3;
                break;
            case 15:
                view2 = new vr8(this, context, profileActivity.A0);
                mf5Var = view2;
                break;
            case 17:
                mf5Var = new ilb(context, profileActivity.A0);
                break;
            case 18:
            case 24:
                View av8Var = new av8(i == 18 ? 0 : 1, profileActivity.A0, context);
                yob.h(aob.d6, profileActivity.A0, av8Var);
                mf5Var = av8Var;
                break;
            case 20:
                mf5Var = new wkb(18, profileActivity.A0, context, false);
                break;
            case 21:
                View qu8Var = new qu8(context, profileActivity.A0);
                yob.h(aob.d6, profileActivity.A0, qu8Var);
                mf5Var = qu8Var;
                break;
            case 22:
                View ur8Var = new ur8(context, profileActivity.A0);
                yob.h(aob.d6, profileActivity.A0, ur8Var);
                mf5Var = ur8Var;
                break;
            case 23:
                mf5Var = new mr8(profileActivity);
                break;
            case 25:
                FrameLayout frameLayout = new FrameLayout(context);
                c51 c51Var = new c51(profileActivity.A0, context, true);
                c51Var.f();
                c51Var.i(ob6.M0(2131746435, null), false, true);
                c51Var.setOnClickListener(new kr8(this, b));
                frameLayout.addView(c51Var, tre.d(-1, 48.0f, jn7.D1, 18.0f, 14.0f, 18.0f, 14.0f));
                yob.h(aob.d6, profileActivity.A0, frameLayout);
                view2 = frameLayout;
                mf5Var = view2;
                break;
            case 26:
                mf5Var = new ilb(context, profileActivity.A0);
                break;
            case 27:
                mf5Var = new zb(context, profileActivity.A0);
                break;
            case 28:
                View t62Var = new t62(context, (byte) 21);
                t62Var.setTag(-33024);
                mf5Var = t62Var;
                break;
            case 32:
                mf5Var = new hs8(profileActivity, context);
                break;
            case 33:
                mf5Var = new ao2(context, profileActivity.A0);
                break;
        }
        if (i != 13) {
            mf5Var.setLayoutParams(new r79(-1, -2));
        }
        return new n69(mf5Var);
    }

    @Override // j79
    public final void y(f89 f89Var) {
        View view = f89Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = true;
        }
        if (view instanceof clb) {
            ((clb) view).a.setLoading(profileActivity.o5);
            ((clb) view).b.setLoading(profileActivity.o5);
        }
    }

    @Override // j79
    public final void z(f89 f89Var) {
        View view = f89Var.a;
        ProfileActivity profileActivity = this.e;
        if (view == profileActivity.O) {
            profileActivity.Q = false;
        }
    }
}
