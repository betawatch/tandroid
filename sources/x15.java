// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x15 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x15(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041d  */
    @Override // p8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        TLRPC.Document document;
        boolean z;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i;
        ij6 a;
        byte b = this.a;
        float f = 1.0f;
        byte b2 = 2;
        byte b3 = 1;
        int i2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((w25) obj3).h = false;
                ((u15) obj2).a(null, (String) obj);
                break;
            case 1:
                ((y05) obj3).close();
                ((ht) obj2).a((String) obj);
                break;
            case 2:
                ((y05) obj3).close();
                ((ht) obj2).a((String) obj);
                break;
            case 3:
                ((y05) obj3).close();
                ((pz1) obj2).a((String) obj);
                break;
            case 4:
                v65 v65Var = (v65) obj3;
                ((sb) obj2).setVisibility(0);
                v65Var.c = (Bitmap) obj;
                Paint paint = new Paint(1);
                v65Var.d = paint;
                Bitmap bitmap = v65Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                v65Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                gl.i(colorMatrix, bkb.I.o() ? 0.05f : 0.25f);
                gl.h(colorMatrix, bkb.I.o() ? -0.02f : -0.04f);
                v65Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 5:
                a46 a46Var = (a46) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                a46Var.c();
                if (user != null) {
                    long j = userArr[0].id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    a46Var.u(new z36(bundle, user, userArr, j), false);
                    break;
                }
                break;
            case 6:
                ta8 ta8Var = (ta8) obj3;
                z76 z76Var = (z76) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (ta8Var != null) {
                    ta8Var.a();
                }
                if (z76Var != null) {
                    z76Var.c(surfaceTexture);
                    break;
                } else if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 7:
                gg7 gg7Var = (gg7) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = gg7Var.a2;
                arrayList2.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && gg7Var.Y0(user2)) {
                            arrayList2.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool = gg7Var.m2;
                if (bool == null || !bool.booleanValue()) {
                    gg7Var.b1(true, true);
                    break;
                } else {
                    x15 x15Var = new x15(gg7Var, hashSet, (byte) 8);
                    na7 q1 = na7.q1(y6c.t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                    if (str == null || str.isEmpty()) {
                        gl.d3(new oz(x15Var, (byte) 15));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i2 = connectionsManager.sendRequest(tL_contacts_search, new pl(q1, x15Var, (byte) 3));
                    }
                    gg7Var.h2 = i2;
                    break;
                }
                break;
            case 8:
                gg7 gg7Var2 = (gg7) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && gg7Var2.Y0(user3)) {
                            gg7Var2.a2.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                gg7Var2.b1(true, true);
                break;
            case 9:
                jj7 jj7Var = (jj7) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    jj7Var.K1.setImageDrawable(null);
                    jj7Var.t1.setText(gl.F2(gl.O2(k96.M0(2131748086, null), -1, 0, new bj7(jj7Var, str2, b3), null), true, gl.L(2.6666667f), gl.L(1.0f)));
                } else {
                    Drawable mutate = jj7Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    zkb.x(jj7Var.K1, mutate, bkb.u6, jj7Var.J0, PorterDuff.Mode.SRC_IN);
                    jj7Var.K1.setImageDrawable(mutate);
                    boolean z2 = user4.contact;
                    l46 l46Var = jj7Var.t1;
                    if (z2) {
                        l46Var.setText(gl.F2(gl.O2(k96.M0(2131748087, null), -1, 0, new bj7(jj7Var, user4, b2), null), true, gl.L(2.6666667f), gl.L(1.0f)));
                    } else {
                        l46Var.setText(k96.M0(2131748085, null));
                    }
                }
                jj7Var.I0(false);
                break;
            case 10:
                ArrayList arrayList3 = (ArrayList) obj3;
                be0[] be0VarArr = (be0[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        String str3 = (String) arrayList3.get(i3);
                        int i4 = 0;
                        while (true) {
                            if (i4 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i4).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i4).emoticon, str3)) {
                                    i4++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i4).documents.get(0).longValue();
                                    for (int i5 = 0; i5 < tL_messages_stickerSet.documents.size(); i5++) {
                                        if (tL_messages_stickerSet.documents.get(i5).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i5);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            be0VarArr[i3].j(gl5.b(document), "40_40", gl5.c(ba4.w(document.thumbs, 40, false, null, false), document), "40_40", vu3.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 11:
                ((String[]) obj3)[0] = (String) obj;
                ((sn7) obj2).run();
                break;
            case 12:
                cq7.s((TL_stars.TL_starGiftUnique) obj3, k96.a0(null, null, ((Boolean) obj).booleanValue() ? 2131749510 : 2131749620, (String) obj2));
                break;
            case 13:
                ((qq7) obj3).f0((View) obj2, (String) obj);
                break;
            case 14:
                x6b x6bVar = (x6b) obj3;
                s7b s7bVar = (s7b) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - s7bVar.getBottomPadding2(), x6bVar.n2 - s7bVar.getPaddingUnderContainer()));
                x6bVar.R();
                if (max > 0) {
                    l34 l34Var = x6bVar.z0;
                    if ((l34Var instanceof vhb) && ((vhb) l34Var).getEditText().isFocused()) {
                        z = true;
                        animatorSet = x6bVar.D1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        x6bVar.D1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        zt7 zt7Var = x6bVar.T0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(zt7Var, (Property<zt7, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - gl.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x6bVar.J0, (Property<tt7, Float>) property, max <= 0 ? Math.min(0, gl.L(40.0f) + (-max)) : 0));
                        f7 f7Var = x6bVar.M0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(f7Var, (Property<f7, Float>) property2, !z ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(x6bVar.r0, (Property<cs7, Float>) property2, (z || x6bVar.r1) ? 1.0f : 0.0f));
                        xr7 xr7Var = x6bVar.q0;
                        if (z && !x6bVar.r1) {
                            f = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(xr7Var, (Property<xr7, Float>) property2, f));
                        x6bVar.T0();
                        x6bVar.D1.playTogether(arrayList);
                        AnimatorSet animatorSet2 = x6bVar.D1;
                        if (z) {
                            animatorSet2.setDuration(350L);
                            x6bVar.D1.setInterpolator(s33.h);
                        } else {
                            animatorSet2.setDuration(250L);
                            x6bVar.D1.setInterpolator(gb.w);
                        }
                        x6bVar.D1.start();
                        for (i = 0; i < arrayList.size(); i++) {
                            ((Animator) arrayList.get(i)).setDuration(z ? 350L : 250L);
                            ((Animator) arrayList.get(i)).setInterpolator(z ? s33.h : gb.w);
                            ((Animator) arrayList.get(i)).start();
                        }
                        if (!z) {
                            x6bVar.P0(false);
                        }
                        if (x6bVar.X1 != z) {
                            x6bVar.c0();
                        }
                        x6bVar.X1 = z;
                        break;
                    }
                }
                z = false;
                animatorSet = x6bVar.D1;
                if (animatorSet != null) {
                }
                x6bVar.D1 = new AnimatorSet();
                arrayList = new ArrayList();
                zt7 zt7Var2 = x6bVar.T0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(zt7Var2, (Property<zt7, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - gl.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(x6bVar.J0, (Property<tt7, Float>) property3, max <= 0 ? Math.min(0, gl.L(40.0f) + (-max)) : 0));
                f7 f7Var2 = x6bVar.M0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(f7Var2, (Property<f7, Float>) property22, !z ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(x6bVar.r0, (Property<cs7, Float>) property22, (z || x6bVar.r1) ? 1.0f : 0.0f));
                xr7 xr7Var2 = x6bVar.q0;
                if (z) {
                    f = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(xr7Var2, (Property<xr7, Float>) property22, f));
                x6bVar.T0();
                x6bVar.D1.playTogether(arrayList);
                AnimatorSet animatorSet22 = x6bVar.D1;
                if (z) {
                }
                x6bVar.D1.start();
                while (i < arrayList.size()) {
                }
                if (!z) {
                }
                if (x6bVar.X1 != z) {
                }
                x6bVar.X1 = z;
                break;
            case 15:
                wt7 wt7Var = (wt7) obj3;
                mt7 mt7Var = (mt7) obj2;
                fsc fscVar = (fsc) obj;
                if (fscVar != null) {
                    mt7Var.dismiss();
                    wt7Var.y0(false);
                    wt7Var.a0(wt7Var.m0(fscVar));
                    break;
                }
                break;
            case 16:
                wt7 wt7Var2 = (wt7) obj3;
                o46 o46Var = (o46) obj2;
                c46 c46Var = (c46) obj;
                if (o46Var != null) {
                    int i6 = wt7Var2.v1;
                    o46Var.w0 = c46Var;
                    o46Var.s0.b(i6, c46Var, false);
                    o46Var.m();
                    wt7Var2.a0(o46Var);
                    break;
                } else {
                    wt7Var2.a0(wt7Var2.f0(c46Var));
                    break;
                }
            case 17:
                y28 y28Var = (y28) obj3;
                ng1 ng1Var = (ng1) obj;
                y28Var.z3 = ng1Var;
                h26.n1(new hu0(y28Var, (byte) 9), (TL_stories.TL_premium_boostsStatus) obj2, ng1Var, y28Var.r1, true);
                m8b m8bVar = y28Var.z0;
                if (m8bVar != null) {
                    m8bVar.k1 = false;
                    m8bVar.U();
                    break;
                }
                break;
            case 18:
                ve8 ve8Var = (ve8) obj3;
                d dVar = (d) obj2;
                Long l = (Long) obj;
                Bundle bundle2 = new Bundle();
                if (l.longValue() >= 0) {
                    bundle2.putLong("user_id", l.longValue());
                } else {
                    bundle2.putLong("chat_id", -l.longValue());
                }
                dVar.presentFragment(new ProfileActivity(bundle2, null));
                ve8Var.b(false);
                break;
            case 19:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.Z6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().h2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ck8(profileActivity, userFull, tL_birthday2, b3), 1024);
                break;
            case 20:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getClass();
                ((hd) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    t7b C = t7b.C(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    C.O = a2;
                    j7b j7bVar = C.d1;
                    if (j7bVar != null) {
                        j7bVar.setDialogId(a2);
                    }
                    C.Q(null);
                    break;
                }
                break;
            case 21:
                yo8 yo8Var = (yo8) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document j2 = tx9.j(tL_messages_stickerSet2, str4);
                if (j2 == null) {
                    StringBuilder p = ug8.p("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = bp8.s;
                    fa4.d(p.toString());
                    break;
                } else {
                    ap8 ap8Var = new ap8(null);
                    yo8Var.c = ap8Var;
                    yo8Var.e.add(ap8Var);
                    int f2 = zu3.f();
                    yo8Var.c.M(0);
                    ap8 ap8Var2 = yo8Var.c;
                    w88 w88Var = new w88(yo8Var, (byte) 26);
                    ap8Var2.getClass();
                    ap8Var2.h1 = new zo8(new Runnable[]{w88Var});
                    ap8Var2.d0(gl5.b(j2), f2 + "_" + f2 + "_precache", null, null, tL_messages_stickerSet2, 0);
                    yo8Var.c.I();
                    yo8Var.g[1] = true;
                    yo8Var.a();
                    break;
                }
            case 22:
                lca lcaVar = (lca) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                wsa wsaVar = lcaVar.e;
                int i7 = tL_starGiftCollection.collection_id;
                wsaVar.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i8 = wsaVar.a;
                updatestargiftcollection.peer = na7.q1(i8).h1(wsaVar.b);
                updatestargiftcollection.collection_id = i7;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i8).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                lcaVar.f(true);
                break;
            case 23:
                vw8 vw8Var = (vw8) obj3;
                sw8 sw8Var = (sw8) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (!sw8Var.G && sw8Var.e == null) {
                    vw8Var.E0(sw8Var, bitmap2);
                    break;
                }
                break;
            case 24:
                ((bm0) obj3).a((HashSet) obj2);
                break;
            case 25:
                mc9 mc9Var = (mc9) obj3;
                ij6 ij6Var = (ij6) obj2;
                String str6 = (String) obj;
                if (!TextUtils.isEmpty(str6)) {
                    Editable text = mc9Var.getText();
                    int spanStart = text.getSpanStart(ij6Var);
                    int spanEnd = text.getSpanEnd(ij6Var);
                    if (spanStart >= 0 && spanEnd >= 0 && (a = ij6.a(str6, mc9Var.getCurrentTextColor(), gl.L(gba.T0 + 4))) != null) {
                        boolean z3 = mc9Var.m2;
                        if (z3) {
                            mc9Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, mc9Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, mc9Var.length())), spannableString);
                        mc9Var.setSelection(Math.min(max2 + 1, mc9Var.length()));
                        if (z3) {
                            mc9Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 26:
                hd9 hd9Var = (hd9) obj3;
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                if (pageblockmath != null) {
                    pageblockmath.source = str7;
                    hd9Var.Q.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str7;
                    hd9Var.Q.N1(pageblockmath2);
                    break;
                }
            case 27:
                ye9 ye9Var = (ye9) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                ye9Var.getClass();
                if (!TextUtils.equals(str8, pageblockmath3.source)) {
                    ld9 ld9Var = ye9Var.R3;
                    if (ld9Var != null) {
                        ld9Var.d();
                    }
                    pageblockmath3.source = str8;
                    ye9Var.g3.O(false);
                    ld9 ld9Var2 = ye9Var.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.h();
                    }
                    ye9Var.p3.onContentChanged();
                    break;
                }
                break;
            case 28:
                sn9 sn9Var = (sn9) obj3;
                ta8 ta8Var2 = (ta8) obj2;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                if (ta8Var2 != null) {
                    ta8Var2.a();
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                sn9Var.a();
                break;
            default:
                View view = (View) obj3;
                ur4 ur4Var = (ur4) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    float f3 = iArr[0];
                    Point point = gl.q;
                    int j3 = Utilities.j((int) ((f3 / point.x) * bitmap3.getWidth()), bitmap3.getWidth(), 0);
                    int j4 = Utilities.j((int) ((iArr[1] / ((point.y + gl.m) + gl.n)) * bitmap3.getHeight()), bitmap3.getHeight(), 0);
                    int j5 = Utilities.j((int) ((view.getWidth() / point.x) * bitmap3.getWidth()), bitmap3.getWidth() - j3, 0);
                    int j6 = Utilities.j((int) ((view.getHeight() / ((point.y + gl.m) + gl.n)) * bitmap3.getHeight()), bitmap3.getHeight() - j4, 0);
                    if ((j3 != 0 || j4 != 0 || j5 != bitmap3.getWidth() || j6 != bitmap3.getHeight()) && j5 > 0 && j6 > 0) {
                        bitmap3 = Bitmap.createBitmap(bitmap3, j3, j4, j5, j6);
                    }
                }
                ColorMatrix colorMatrix2 = new ColorMatrix();
                gl.i(colorMatrix2, bkb.I.o() ? 0.04f : 0.25f);
                gl.h(colorMatrix2, bkb.I.o() ? -0.04f : -0.07f);
                Bitmap l2 = gl.l(bitmap3, colorMatrix2);
                l2.setHasAlpha(false);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                colorMatrix3.setSaturation(bkb.I.o() ? 2.0f : 3.0f);
                gl.h(colorMatrix3, bkb.I.o() ? -0.2f : -0.07f);
                Bitmap l3 = gl.l(bitmap3, colorMatrix3);
                l3.setHasAlpha(false);
                bitmap3.recycle();
                ur4Var.a(l2, l3);
                break;
        }
    }
}
