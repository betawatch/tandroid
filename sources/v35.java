// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class v35 implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v35(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x031f  */
    @Override // pcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        TLRPC.Document document;
        boolean z;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i;
        nl6 a;
        byte b = this.a;
        float f = 1.0f;
        byte b2 = 9;
        byte b3 = 3;
        int i2 = 0;
        Object[] objArr = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ((c35) obj3).close();
                ((v35) obj2).a((String) obj);
                break;
            case 1:
                hl.c3(new re4(obj3, obj2, obj, (byte) 14));
                break;
            case 2:
                ((a55) obj3).h = false;
                ((g45) obj2).a(null, (String) obj);
                break;
            case 3:
                ((c35) obj3).close();
                ((gt) obj2).a((String) obj);
                break;
            case 4:
                ((c35) obj3).close();
                ((gt) obj2).a((String) obj);
                break;
            case 5:
                x85 x85Var = (x85) obj3;
                ((tb) obj2).setVisibility(0);
                x85Var.c = (Bitmap) obj;
                Paint paint = new Paint(1);
                x85Var.d = paint;
                Bitmap bitmap = x85Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                x85Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                hl.i(colorMatrix, aob.I.o() ? 0.05f : 0.25f);
                hl.h(colorMatrix, aob.I.o() ? -0.02f : -0.04f);
                x85Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 6:
                e66 e66Var = (e66) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                e66Var.c();
                if (user != null) {
                    long j = userArr[0].id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    e66Var.u(new d66(bundle, user, userArr, j), false);
                    break;
                }
                break;
            case 7:
                ke8 ke8Var = (ke8) obj3;
                da6 da6Var = (da6) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (ke8Var != null) {
                    ke8Var.a();
                }
                if (da6Var != null) {
                    da6Var.c(surfaceTexture);
                    break;
                } else if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 8:
                qi7 qi7Var = (qi7) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = qi7Var.a2;
                arrayList2.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && qi7Var.Z0(user2)) {
                            arrayList2.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool = qi7Var.m2;
                if (bool == null || !bool.booleanValue()) {
                    qi7Var.c1(true, true);
                    break;
                } else {
                    v35 v35Var = new v35(qi7Var, hashSet, b2);
                    uc7 s1 = uc7.s1(yac.t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                    if (str == null || str.isEmpty()) {
                        hl.c3(new pz(v35Var, (byte) 17));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i2 = connectionsManager.sendRequest(tL_contacts_search, new ql(s1, v35Var, b3));
                    }
                    qi7Var.h2 = i2;
                    break;
                }
                break;
            case 9:
                qi7 qi7Var2 = (qi7) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && qi7Var2.Z0(user3)) {
                            qi7Var2.a2.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                qi7Var2.c1(true, true);
                break;
            case 10:
                sl7 sl7Var = (sl7) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    sl7Var.K1.setImageDrawable(null);
                    sl7Var.t1.setText(hl.E2(hl.N2(ob6.M0(2131748032, null), -1, 0, new t87(sl7Var, str2, (byte) 29), null), true, hl.L(2.6666667f), hl.L(1.0f)));
                } else {
                    Drawable mutate = sl7Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    yob.x(sl7Var.K1, mutate, aob.v6, sl7Var.J0, PorterDuff.Mode.SRC_IN);
                    sl7Var.K1.setImageDrawable(mutate);
                    boolean z2 = user4.contact;
                    p66 p66Var = sl7Var.t1;
                    if (z2) {
                        p66Var.setText(hl.E2(hl.N2(ob6.M0(2131748033, null), -1, 0, new ql7(sl7Var, user4, objArr == true ? 1 : 0), null), true, hl.L(2.6666667f), hl.L(1.0f)));
                    } else {
                        p66Var.setText(ob6.M0(2131748031, null));
                    }
                }
                sl7Var.J0(false);
                break;
            case 11:
                ArrayList arrayList3 = (ArrayList) obj3;
                de0[] de0VarArr = (de0[]) obj2;
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
                            de0VarArr[i3].j(jn5.b(document), "40_40", jn5.c(xb4.w(document.thumbs, 40, false, null, false), document), "40_40", pv3.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 12:
                ((String[]) obj3)[0] = (String) obj;
                ((sq7) obj2).run();
                break;
            case 13:
                it7.v((TL_stars.TL_starGiftUnique) obj3, ob6.a0(null, null, ((Boolean) obj).booleanValue() ? 2131749471 : 2131749581, (String) obj2));
                break;
            case 14:
                ((vt7) obj3).f0((View) obj2, (String) obj);
                break;
            case 15:
                wab wabVar = (wab) obj3;
                rbb rbbVar = (rbb) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - rbbVar.getBottomPadding2(), wabVar.h2 - rbbVar.getPaddingUnderContainer()));
                wabVar.R();
                if (max > 0) {
                    h44 h44Var = wabVar.t0;
                    if ((h44Var instanceof rlb) && ((rlb) h44Var).getEditText().isFocused()) {
                        z = true;
                        animatorSet = wabVar.x1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        wabVar.x1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        gx7 gx7Var = wabVar.N0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(gx7Var, (Property<gx7, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - hl.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(wabVar.D0, (Property<ax7, Float>) property, max <= 0 ? Math.min(0, hl.L(40.0f) + (-max)) : 0));
                        g7 g7Var = wabVar.G0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(g7Var, (Property<g7, Float>) property2, !z ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(wabVar.l0, (Property<iv7, Float>) property2, (z || wabVar.l1) ? 1.0f : 0.0f));
                        dv7 dv7Var = wabVar.k0;
                        if (z && !wabVar.l1) {
                            f = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(dv7Var, (Property<dv7, Float>) property2, f));
                        wabVar.S0();
                        wabVar.x1.playTogether(arrayList);
                        AnimatorSet animatorSet2 = wabVar.x1;
                        if (z) {
                            animatorSet2.setDuration(350L);
                            wabVar.x1.setInterpolator(k43.h);
                        } else {
                            animatorSet2.setDuration(250L);
                            wabVar.x1.setInterpolator(hb.w);
                        }
                        wabVar.x1.start();
                        for (i = 0; i < arrayList.size(); i++) {
                            ((Animator) arrayList.get(i)).setDuration(z ? 350L : 250L);
                            ((Animator) arrayList.get(i)).setInterpolator(z ? k43.h : hb.w);
                            ((Animator) arrayList.get(i)).start();
                        }
                        if (!z) {
                            wabVar.O0(false);
                        }
                        if (wabVar.R1 != z) {
                            wabVar.c0();
                        }
                        wabVar.R1 = z;
                        break;
                    }
                }
                z = false;
                animatorSet = wabVar.x1;
                if (animatorSet != null) {
                }
                wabVar.x1 = new AnimatorSet();
                arrayList = new ArrayList();
                gx7 gx7Var2 = wabVar.N0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(gx7Var2, (Property<gx7, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - hl.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(wabVar.D0, (Property<ax7, Float>) property3, max <= 0 ? Math.min(0, hl.L(40.0f) + (-max)) : 0));
                g7 g7Var2 = wabVar.G0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(g7Var2, (Property<g7, Float>) property22, !z ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(wabVar.l0, (Property<iv7, Float>) property22, (z || wabVar.l1) ? 1.0f : 0.0f));
                dv7 dv7Var2 = wabVar.k0;
                if (z) {
                    f = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(dv7Var2, (Property<dv7, Float>) property22, f));
                wabVar.S0();
                wabVar.x1.playTogether(arrayList);
                AnimatorSet animatorSet22 = wabVar.x1;
                if (z) {
                }
                wabVar.x1.start();
                while (i < arrayList.size()) {
                }
                if (!z) {
                }
                if (wabVar.R1 != z) {
                }
                wabVar.R1 = z;
                break;
            case 16:
                dx7 dx7Var = (dx7) obj3;
                tw7 tw7Var = (tw7) obj2;
                vwc vwcVar = (vwc) obj;
                if (vwcVar != null) {
                    tw7Var.dismiss();
                    dx7Var.y0(false);
                    dx7Var.a0(dx7Var.m0(vwcVar));
                    break;
                }
                break;
            case 17:
                dx7 dx7Var2 = (dx7) obj3;
                s66 s66Var = (s66) obj2;
                g66 g66Var = (g66) obj;
                if (s66Var != null) {
                    int i6 = dx7Var2.p1;
                    s66Var.w0 = g66Var;
                    s66Var.s0.b(i6, g66Var, false);
                    s66Var.m();
                    dx7Var2.a0(s66Var);
                    break;
                } else {
                    dx7Var2.a0(dx7Var2.f0(g66Var));
                    break;
                }
            case 18:
                o68 o68Var = (o68) obj3;
                wg1 wg1Var = (wg1) obj;
                o68Var.t3 = wg1Var;
                l46.o1(new qu0(o68Var, b2), (TL_stories.TL_premium_boostsStatus) obj2, wg1Var, o68Var.l1, true);
                lcb lcbVar = o68Var.t0;
                if (lcbVar != null) {
                    lcbVar.k1 = false;
                    lcbVar.U();
                    break;
                }
                break;
            case 19:
                ji8 ji8Var = (ji8) obj3;
                e eVar = (e) obj2;
                Long l = (Long) obj;
                Bundle bundle2 = new Bundle();
                if (l.longValue() >= 0) {
                    bundle2.putLong("user_id", l.longValue());
                } else {
                    bundle2.putLong("chat_id", -l.longValue());
                }
                eVar.presentFragment(new ProfileActivity(bundle2, null));
                ji8Var.b(false);
                break;
            case 20:
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
                profileActivity.getMessagesController().j2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new qn8(profileActivity, userFull, tL_birthday2, b3), 1024);
                break;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getClass();
                ((id) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    sbb C = sbb.C(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    C.O = a2;
                    ibb ibbVar = C.d1;
                    if (ibbVar != null) {
                        ibbVar.setDialogId(a2);
                    }
                    C.Q(null);
                    break;
                }
                break;
            case 22:
                ks8 ks8Var = (ks8) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document j2 = n1a.j(tL_messages_stickerSet2, str4);
                if (j2 == null) {
                    StringBuilder p = ik8.p("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = ns8.s;
                    cc4.d(p.toString());
                    break;
                } else {
                    ms8 ms8Var = new ms8(null);
                    ks8Var.c = ms8Var;
                    ks8Var.e.add(ms8Var);
                    int f2 = tv3.f();
                    ks8Var.c.M(0);
                    ms8 ms8Var2 = ks8Var.c;
                    String str5 = f2 + "_" + f2 + "_precache";
                    uk8 uk8Var = new uk8(ks8Var, (byte) 12);
                    ms8Var2.getClass();
                    ms8Var2.h1 = new ls8(new Runnable[]{uk8Var});
                    ms8Var2.d0(jn5.b(j2), str5, null, null, tL_messages_stickerSet2, 0);
                    ks8Var.c.I();
                    ks8Var.g[1] = true;
                    ks8Var.a();
                    break;
                }
            case 23:
                cga cgaVar = (cga) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str6 = (String) obj;
                zwa zwaVar = cgaVar.e;
                int i7 = tL_starGiftCollection.collection_id;
                zwaVar.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i8 = zwaVar.a;
                updatestargiftcollection.peer = uc7.s1(i8).j1(zwaVar.b);
                updatestargiftcollection.collection_id = i7;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i8).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                cgaVar.f(true);
                break;
            case 24:
                g09 g09Var = (g09) obj3;
                d09 d09Var = (d09) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (!d09Var.G && d09Var.e == null) {
                    g09Var.E0(d09Var, bitmap2);
                    break;
                }
                break;
            case 25:
                ((bm0) obj3).a((HashSet) obj2);
                break;
            case 26:
                dg9 dg9Var = (dg9) obj3;
                Object obj4 = (nl6) obj2;
                String str7 = (String) obj;
                if (!TextUtils.isEmpty(str7)) {
                    Editable text = dg9Var.getText();
                    int spanStart = text.getSpanStart(obj4);
                    int spanEnd = text.getSpanEnd(obj4);
                    if (spanStart >= 0 && spanEnd >= 0 && (a = nl6.a(str7, dg9Var.getCurrentTextColor(), hl.L(xea.S0 + 4))) != null) {
                        boolean z3 = dg9Var.n2;
                        if (z3) {
                            dg9Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, dg9Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, dg9Var.length())), spannableString);
                        dg9Var.setSelection(Math.min(max2 + 1, dg9Var.length()));
                        if (z3) {
                            dg9Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                yg9 yg9Var = (yg9) obj3;
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                if (pageblockmath != null) {
                    pageblockmath.source = str8;
                    yg9Var.Q.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str8;
                    yg9Var.Q.O1(pageblockmath2);
                    break;
                }
            case 28:
                pi9 pi9Var = (pi9) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                pi9Var.getClass();
                if (!TextUtils.equals(str9, pageblockmath3.source)) {
                    ch9 ch9Var = pi9Var.R3;
                    if (ch9Var != null) {
                        ch9Var.d();
                    }
                    pageblockmath3.source = str9;
                    pi9Var.g3.O(false);
                    ch9 ch9Var2 = pi9Var.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.h();
                    }
                    pi9Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                ir9 ir9Var = (ir9) obj3;
                ke8 ke8Var2 = (ke8) obj2;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                if (ke8Var2 != null) {
                    ke8Var2.a();
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                ir9Var.a();
                break;
        }
    }
}
