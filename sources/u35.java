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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u35 implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u35(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0320  */
    @Override // qac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        TLRPC.Document document;
        boolean z;
        AnimatorSet animatorSet;
        ArrayList arrayList;
        int i;
        ll6 a;
        byte b = this.a;
        byte b2 = 3;
        float f = 1.0f;
        byte b3 = 9;
        byte b4 = 4;
        byte b5 = 1;
        int i2 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                gm.c3(new if4(obj3, obj2, obj, (byte) 11));
                break;
            case 1:
                ((w45) obj3).h = false;
                ((v35) obj2).a(null, (String) obj);
                break;
            case 2:
                ((y25) obj3).close();
                ((iu) obj2).a((String) obj);
                break;
            case 3:
                ((y25) obj3).close();
                ((iu) obj2).a((String) obj);
                break;
            case 4:
                ((y25) obj3).close();
                ((u35) obj2).a((String) obj);
                break;
            case 5:
                t85 t85Var = (t85) obj3;
                ((sb) obj2).setVisibility(0);
                t85Var.c = (Bitmap) obj;
                Paint paint = new Paint(1);
                t85Var.d = paint;
                Bitmap bitmap = t85Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                t85Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                gm.i(colorMatrix, cmb.I.o() ? 0.05f : 0.25f);
                gm.h(colorMatrix, cmb.I.o() ? -0.02f : -0.04f);
                t85Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 6:
                a66 a66Var = (a66) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                a66Var.c();
                if (user != null) {
                    long j = userArr[0].id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    a66Var.u(new z56(bundle, user, userArr, j), false);
                    break;
                }
                break;
            case 7:
                wc8 wc8Var = (wc8) obj3;
                y96 y96Var = (y96) obj2;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
                if (wc8Var != null) {
                    wc8Var.a();
                }
                if (y96Var != null) {
                    y96Var.c(surfaceTexture);
                    break;
                } else if (surfaceTexture != null) {
                    surfaceTexture.release();
                    break;
                }
                break;
            case 8:
                ji7 ji7Var = (ji7) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = ji7Var.a2;
                arrayList2.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && ji7Var.Y0(user2)) {
                            arrayList2.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool = ji7Var.m2;
                if (bool == null || !bool.booleanValue()) {
                    ji7Var.b1(true, true);
                    break;
                } else {
                    u35 u35Var = new u35(ji7Var, hashSet, b3);
                    oc7 r1 = oc7.r1(z8c.t0);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
                    if (str == null || str.isEmpty()) {
                        gm.c3(new f00(u35Var, (byte) 17));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i2 = connectionsManager.sendRequest(tL_contacts_search, new pm(r1, u35Var, b2));
                    }
                    ji7Var.h2 = i2;
                    break;
                }
                break;
            case 9:
                ji7 ji7Var2 = (ji7) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && ji7Var2.Y0(user3)) {
                            ji7Var2.a2.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                ji7Var2.b1(true, true);
                break;
            case 10:
                ml7 ml7Var = (ml7) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ml7Var.K1.setImageDrawable(null);
                    ml7Var.t1.setText(gm.E2(gm.N2(jb6.M0(2131748035, null), -1, 0, new bl7(ml7Var, str2, (byte) 2), null), true, gm.L(2.6666667f), gm.L(1.0f)));
                } else {
                    Drawable mutate = ml7Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    anb.x(ml7Var.K1, mutate, cmb.u6, ml7Var.J0, PorterDuff.Mode.SRC_IN);
                    ml7Var.K1.setImageDrawable(mutate);
                    boolean z2 = user4.contact;
                    l66 l66Var = ml7Var.t1;
                    if (z2) {
                        l66Var.setText(gm.E2(gm.N2(jb6.M0(2131748036, null), -1, 0, new bl7(ml7Var, user4, b2), null), true, gm.L(2.6666667f), gm.L(1.0f)));
                    } else {
                        l66Var.setText(jb6.M0(2131748034, null));
                    }
                }
                ml7Var.I0(false);
                break;
            case 11:
                ArrayList arrayList3 = (ArrayList) obj3;
                bf0[] bf0VarArr = (bf0[]) obj2;
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
                            bf0VarArr[i3].j(gn5.b(document), "40_40", gn5.c(bc4.w(document.thumbs, 40, false, null, false), document), "40_40", gw3.f(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 12:
                ((String[]) obj3)[0] = (String) obj;
                ((vp7) obj2).run();
                break;
            case 13:
                fs7.s((TL_stars.TL_starGiftUnique) obj3, jb6.a0(null, null, ((Boolean) obj).booleanValue() ? 2131749459 : 2131749569, (String) obj2));
                break;
            case 14:
                ((ss7) obj3).g0((View) obj2, (String) obj);
                break;
            case 15:
                z8b z8bVar = (z8b) obj3;
                u9b u9bVar = (u9b) obj2;
                int max = Math.max(0, Math.max(((Integer) obj).intValue() - u9bVar.getBottomPadding2(), z8bVar.n2 - u9bVar.getPaddingUnderContainer()));
                z8bVar.R();
                if (max > 0) {
                    w44 w44Var = z8bVar.z0;
                    if ((w44Var instanceof xjb) && ((xjb) w44Var).getEditText().isFocused()) {
                        z = true;
                        animatorSet = z8bVar.D1;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        z8bVar.D1 = new AnimatorSet();
                        arrayList = new ArrayList();
                        aw7 aw7Var = z8bVar.T0;
                        Property property = View.TRANSLATION_Y;
                        arrayList.add(ObjectAnimator.ofFloat(aw7Var, (Property<aw7, Float>) property, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - gm.L(8.0f)) : 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(z8bVar.J0, (Property<uv7, Float>) property, max <= 0 ? Math.min(0, gm.L(40.0f) + (-max)) : 0));
                        f7 f7Var = z8bVar.M0;
                        Property property2 = View.ALPHA;
                        arrayList.add(ObjectAnimator.ofFloat(f7Var, (Property<f7, Float>) property2, !z ? 0.0f : 1.0f));
                        arrayList.add(ObjectAnimator.ofFloat(z8bVar.r0, (Property<du7, Float>) property2, (z || z8bVar.r1) ? 1.0f : 0.0f));
                        yt7 yt7Var = z8bVar.q0;
                        if (z && !z8bVar.r1) {
                            f = 0.0f;
                        }
                        arrayList.add(ObjectAnimator.ofFloat(yt7Var, (Property<yt7, Float>) property2, f));
                        z8bVar.T0();
                        z8bVar.D1.playTogether(arrayList);
                        AnimatorSet animatorSet2 = z8bVar.D1;
                        if (z) {
                            animatorSet2.setDuration(350L);
                            z8bVar.D1.setInterpolator(d53.h);
                        } else {
                            animatorSet2.setDuration(250L);
                            z8bVar.D1.setInterpolator(gb.w);
                        }
                        z8bVar.D1.start();
                        for (i = 0; i < arrayList.size(); i++) {
                            ((Animator) arrayList.get(i)).setDuration(z ? 350L : 250L);
                            ((Animator) arrayList.get(i)).setInterpolator(z ? d53.h : gb.w);
                            ((Animator) arrayList.get(i)).start();
                        }
                        if (!z) {
                            z8bVar.P0(false);
                        }
                        if (z8bVar.X1 != z) {
                            z8bVar.c0();
                        }
                        z8bVar.X1 = z;
                        break;
                    }
                }
                z = false;
                animatorSet = z8bVar.D1;
                if (animatorSet != null) {
                }
                z8bVar.D1 = new AnimatorSet();
                arrayList = new ArrayList();
                aw7 aw7Var2 = z8bVar.T0;
                Property property3 = View.TRANSLATION_Y;
                arrayList.add(ObjectAnimator.ofFloat(aw7Var2, (Property<aw7, Float>) property3, max <= 0 ? Math.min(0.0f, ((-max) / 2.0f) - gm.L(8.0f)) : 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(z8bVar.J0, (Property<uv7, Float>) property3, max <= 0 ? Math.min(0, gm.L(40.0f) + (-max)) : 0));
                f7 f7Var2 = z8bVar.M0;
                Property property22 = View.ALPHA;
                arrayList.add(ObjectAnimator.ofFloat(f7Var2, (Property<f7, Float>) property22, !z ? 0.0f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(z8bVar.r0, (Property<du7, Float>) property22, (z || z8bVar.r1) ? 1.0f : 0.0f));
                yt7 yt7Var2 = z8bVar.q0;
                if (z) {
                    f = 0.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(yt7Var2, (Property<yt7, Float>) property22, f));
                z8bVar.T0();
                z8bVar.D1.playTogether(arrayList);
                AnimatorSet animatorSet22 = z8bVar.D1;
                if (z) {
                }
                z8bVar.D1.start();
                while (i < arrayList.size()) {
                }
                if (!z) {
                }
                if (z8bVar.X1 != z) {
                }
                z8bVar.X1 = z;
                break;
            case 16:
                xv7 xv7Var = (xv7) obj3;
                nv7 nv7Var = (nv7) obj2;
                iuc iucVar = (iuc) obj;
                if (iucVar != null) {
                    nv7Var.dismiss();
                    xv7Var.y0(false);
                    xv7Var.a0(xv7Var.m0(iucVar));
                    break;
                }
                break;
            case 17:
                xv7 xv7Var2 = (xv7) obj3;
                o66 o66Var = (o66) obj2;
                c66 c66Var = (c66) obj;
                if (o66Var != null) {
                    int i6 = xv7Var2.v1;
                    o66Var.w0 = c66Var;
                    o66Var.s0.b(i6, c66Var, false);
                    o66Var.m();
                    xv7Var2.a0(o66Var);
                    break;
                } else {
                    xv7Var2.a0(xv7Var2.f0(c66Var));
                    break;
                }
            case 18:
                a58 a58Var = (a58) obj3;
                vh1 vh1Var = (vh1) obj;
                a58Var.z3 = vh1Var;
                i46.n1(new qv0(a58Var, b3), (TL_stories.TL_premium_boostsStatus) obj2, vh1Var, a58Var.r1, true);
                oab oabVar = a58Var.z0;
                if (oabVar != null) {
                    oabVar.k1 = false;
                    oabVar.U();
                    break;
                }
                break;
            case 19:
                xg8 xg8Var = (xg8) obj3;
                d dVar = (d) obj2;
                Long l = (Long) obj;
                Bundle bundle2 = new Bundle();
                if (l.longValue() >= 0) {
                    bundle2.putLong("user_id", l.longValue());
                } else {
                    bundle2.putLong("chat_id", -l.longValue());
                }
                dVar.presentFragment(new ProfileActivity(bundle2, null));
                xg8Var.b(false);
                break;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                RectF rectF = ProfileActivity.e7;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().i2();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new fm8(profileActivity, userFull, tL_birthday2, b5), 1024);
                break;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                RectF rectF2 = ProfileActivity.e7;
                profileActivity2.getClass();
                ((he) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    v9b C = v9b.C(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    C.O = a2;
                    l9b l9bVar = C.d1;
                    if (l9bVar != null) {
                        l9bVar.setDialogId(a2);
                    }
                    C.Q(null);
                    break;
                }
                break;
            case 22:
                zq8 zq8Var = (zq8) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document j2 = vz9.j(tL_messages_stickerSet2, str4);
                if (j2 == null) {
                    StringBuilder p = wi8.p("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = cr8.s;
                    fc4.d(p.toString());
                    break;
                } else {
                    br8 br8Var = new br8(null);
                    zq8Var.c = br8Var;
                    zq8Var.e.add(br8Var);
                    int f2 = kw3.f();
                    zq8Var.c.M(0);
                    br8 br8Var2 = zq8Var.c;
                    String str5 = f2 + "_" + f2 + "_precache";
                    pp8 pp8Var = new pp8(zq8Var, b4);
                    br8Var2.getClass();
                    br8Var2.h1 = new ar8(new Runnable[]{pp8Var});
                    br8Var2.d0(gn5.b(j2), str5, null, null, tL_messages_stickerSet2, 0);
                    zq8Var.c.I();
                    zq8Var.g[1] = true;
                    zq8Var.a();
                    break;
                }
            case 23:
                lea leaVar = (lea) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str6 = (String) obj;
                yua yuaVar = leaVar.e;
                int i7 = tL_starGiftCollection.collection_id;
                yuaVar.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i8 = yuaVar.a;
                updatestargiftcollection.peer = oc7.r1(i8).i1(yuaVar.b);
                updatestargiftcollection.collection_id = i7;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i8).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                leaVar.f(true);
                break;
            case 24:
                wy8 wy8Var = (wy8) obj3;
                ty8 ty8Var = (ty8) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (!ty8Var.G && ty8Var.e == null) {
                    wy8Var.E0(ty8Var, bitmap2);
                    break;
                }
                break;
            case 25:
                ((bn0) obj3).a((HashSet) obj2);
                break;
            case 26:
                ne9 ne9Var = (ne9) obj3;
                ll6 ll6Var = (ll6) obj2;
                String str7 = (String) obj;
                if (!TextUtils.isEmpty(str7)) {
                    Editable text = ne9Var.getText();
                    int spanStart = text.getSpanStart(ll6Var);
                    int spanEnd = text.getSpanEnd(ll6Var);
                    if (spanStart >= 0 && spanEnd >= 0 && (a = ll6.a(str7, ne9Var.getCurrentTextColor(), gm.L(gda.S0 + 4))) != null) {
                        boolean z3 = ne9Var.m2;
                        if (z3) {
                            ne9Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a, 0, 1, 33);
                        int max2 = Math.max(0, Math.min(spanStart, ne9Var.length()));
                        text.replace(max2, Math.max(max2, Math.min(spanEnd, ne9Var.length())), spannableString);
                        ne9Var.setSelection(Math.min(max2 + 1, ne9Var.length()));
                        if (z3) {
                            ne9Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 27:
                jf9 jf9Var = (jf9) obj3;
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str8 = (String) obj;
                if (pageblockmath != null) {
                    pageblockmath.source = str8;
                    jf9Var.Q.g3.O(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str8;
                    jf9Var.Q.N1(pageblockmath2);
                    break;
                }
            case 28:
                ch9 ch9Var = (ch9) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                ch9Var.getClass();
                if (!TextUtils.equals(str9, pageblockmath3.source)) {
                    of9 of9Var = ch9Var.R3;
                    if (of9Var != null) {
                        of9Var.d();
                    }
                    pageblockmath3.source = str9;
                    ch9Var.g3.O(false);
                    of9 of9Var2 = ch9Var.R3;
                    if (of9Var2 != null) {
                        of9Var2.h();
                    }
                    ch9Var.p3.onContentChanged();
                    break;
                }
                break;
            default:
                tp9 tp9Var = (tp9) obj3;
                wc8 wc8Var2 = (wc8) obj2;
                SurfaceTexture surfaceTexture2 = (SurfaceTexture) obj;
                if (wc8Var2 != null) {
                    wc8Var2.a();
                }
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                }
                tp9Var.a();
                break;
        }
    }
}
