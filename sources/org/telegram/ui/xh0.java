package org.telegram.ui;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xh0 extends org.telegram.ui.ActionBar.h2 implements org.telegram.ui.Components.ak, org.telegram.messenger.fs {
    public int E;
    public int F;
    public int G;
    public vh0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.ao K;
    public long L;
    public int M;
    public vh0 N;
    public org.telegram.ui.Components.si O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public org.telegram.ui.Components.ck0 d;
    public di.l4 e;
    public final org.telegram.ui.ActionBar.i6 f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public xh0(Bundle bundle, org.telegram.ui.ActionBar.i6 i6Var) {
        super(bundle);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.G = 100;
        this.J = new SparseArray();
        this.M = -1;
        this.Q = 0L;
        this.f = i6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:15:0x0052, B:17:0x0059, B:21:0x0074, B:23:0x0078, B:25:0x007c, B:26:0x0095, B:28:0x0099, B:30:0x009f, B:34:0x00b2, B:36:0x00c3, B:38:0x00c9, B:39:0x00e2), top: B:14:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(xh0 xh0Var, Context context, View view, int i7) {
        xh0 xh0Var2;
        Context context2;
        File file;
        if (i7 == xh0Var.s) {
            xh0Var2 = xh0Var;
            context2 = context;
            org.telegram.ui.Components.si siVar = new org.telegram.ui.Components.si(context2, xh0Var2, false, false, true, xh0Var.f);
            xh0Var2.O = siVar;
            siVar.I1 = true;
            siVar.v3.setVisibility(8);
            siVar.h3.setText(org.telegram.messenger.gd.M0(2131752110, null));
            xh0Var2.O.f1();
            xh0Var2.O.show();
        } else {
            xh0Var2 = xh0Var;
            context2 = context;
        }
        if (view instanceof wh0) {
            wh0 wh0Var = (wh0) view;
            if (xh0Var2.simpleActionBar.x() || wh0Var.e == null) {
                xh0Var2.e0(wh0Var.e);
                return;
            }
            Ringtone ringtone = xh0Var2.P;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                vh0 vh0Var = wh0Var.e;
                if (vh0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    xh0Var2.P = ringtone2;
                    ringtone2.play();
                } else {
                    String str = vh0Var.g;
                    if (str != null && !vh0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(wh0Var.e.g));
                        ringtone3.setStreamType(4);
                        xh0Var2.P = ringtone3;
                        ringtone3.play();
                    } else if (vh0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(wh0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    org.telegram.messenger.w7 fileLoader = xh0Var2.getFileLoader();
                                    TLRPC.Document document = wh0Var.e.e;
                                    fileLoader.getClass();
                                    file = org.telegram.messenger.w7.I(document);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    xh0Var2.P = ringtone4;
                                    ringtone4.play();
                                } else {
                                    org.telegram.messenger.w7 fileLoader2 = xh0Var2.getFileLoader();
                                    TLRPC.Document document2 = wh0Var.e.e;
                                    fileLoader2.W(document2, document2, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        org.telegram.messenger.w7 fileLoader22 = xh0Var2.getFileLoader();
                        TLRPC.Document document22 = wh0Var.e.e;
                        fileLoader22.W(document22, document22, 3, 0);
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            xh0Var2.N = null;
            xh0Var2.H = wh0Var.e;
            xh0Var2.I = true;
            di.l4 l4Var = xh0Var2.e;
            l4Var.k(0, ((xh0) l4Var.d).h);
        }
    }

    public static void b0(xh0 xh0Var) {
        xh0Var.J.clear();
        di.l4 l4Var = xh0Var.e;
        l4Var.k(0, ((xh0) l4Var.d).h);
        xh0Var.h0();
    }

    public static void f0(View view, int i7, int i10) {
        if (view instanceof org.telegram.ui.Cells.i2) {
            org.telegram.ui.Cells.i2 i2Var = (org.telegram.ui.Cells.i2) view;
            for (int i11 = 0; i11 < i2Var.getChildCount(); i11++) {
                View childAt = i2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.mq) {
                        org.telegram.ui.Components.mq mqVar = (org.telegram.ui.Components.mq) imageView.getDrawable();
                        Drawable drawable = mqVar.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = mqVar.b;
                        if (drawable2 != null) {
                            drawable2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
                        }
                        childAt.invalidate();
                    }
                }
            }
        }
    }

    public static String g0(TLRPC.Document document, String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(46)) != -1) {
            str = str.substring(0, lastIndexOf);
        }
        return (!TextUtils.isEmpty(str) || document == null) ? str : org.telegram.messenger.gd.a0("SoundNameEmpty", null, 2131745083, org.telegram.messenger.gd.u(document.date, true));
    }

    @Override // org.telegram.ui.Components.ak
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("audio/mpeg");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new uh0(this, context));
        if (this.L == 0) {
            int i7 = this.M;
            if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747675, null));
            } else if (i7 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747676, null));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747677, null));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747673, null));
            } else if (i7 == 5 || i7 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131747674, null));
            }
        } else {
            this.K = new org.telegram.ui.Components.ao(context, null, false, this.f);
            if (this.L >= 0) {
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(this.L));
                if (c22 != null) {
                    this.K.setUserAvatar(c22);
                    this.simpleActionBar.setTitle(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                }
            } else if (this.Q != 0) {
                TLRPC.TL_forumTopic f10 = getMessagesController().t7.f(-this.L, this.Q);
                qg.c.q(this.K.getAvatarImageView(), f10, false, true, this.f);
                this.simpleActionBar.setTitle(f10.title);
            } else {
                TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-this.L));
                this.K.setChatAvatar(O0);
                this.simpleActionBar.setTitle(O0.title);
            }
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.M0(2131747678, null));
            org.telegram.messenger.g0.E2(this.K.e);
            this.simpleActionBar.addView(this.K.e, c8.ma.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.g5 q10 = this.simpleActionBar.q();
        q10.d(2, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131745264, null));
        q10.d(1, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.M0(2131751587, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.d = ck0Var;
        ck0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, c8.ma.c(-1.0f, -1));
        di.l4 l4Var = new di.l4(this, 8);
        this.e = l4Var;
        l4Var.C(true);
        this.d.setAdapter(this.e);
        ((v4.k) this.d.getItemAnimator()).m = false;
        ((v4.k) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new v4.c0());
        this.d.setOnItemClickListener(new fi.g4(20, this, context));
        this.d.setOnItemLongClickListener(new zr(this, 27));
        getMediaDataController().A0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i10 = 0; i10 < getMediaDataController().A0.e.size(); i10++) {
            yf.b bVar = (yf.b) getMediaDataController().A0.e.get(i10);
            vh0 vh0Var = new vh0();
            int i11 = this.G;
            this.G = i11 + 1;
            vh0Var.c = i11;
            vh0Var.a = true;
            vh0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            vh0Var.f = str;
            vh0Var.e = document3;
            vh0Var.f = g0(document3, str);
            vh0Var.g = bVar.b;
            vh0 vh0Var2 = this.N;
            if (vh0Var2 != null && (document = vh0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = vh0Var;
            }
            this.a.add(vh0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        vh0 vh0Var3 = new vh0();
        int i12 = this.G;
        this.G = i12 + 1;
        vh0Var3.c = i12;
        vh0Var3.f = org.telegram.messenger.gd.M0(2131747959, null);
        this.b.add(vh0Var3);
        vh0 vh0Var4 = new vh0();
        int i13 = this.G;
        this.G = i13 + 1;
        vh0Var4.c = i13;
        vh0Var4.f = org.telegram.messenger.gd.M0(2131751588, null);
        vh0Var4.b = true;
        this.b.add(vh0Var4);
        vh0 vh0Var5 = this.N;
        if (vh0Var5 != null && vh0Var5.e == null && vh0Var5.g.equals("NoSound")) {
            this.N = null;
            this.H = vh0Var3;
        }
        vh0 vh0Var6 = this.N;
        if (vh0Var6 != null && vh0Var6.e == null && vh0Var6.g.equals("Default")) {
            this.N = null;
            this.H = vh0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            vh0 vh0Var7 = new vh0();
            int i14 = this.G;
            this.G = i14 + 1;
            vh0Var7.c = i14;
            vh0Var7.f = string;
            vh0Var7.g = str2;
            vh0 vh0Var8 = this.N;
            if (vh0Var8 != null && vh0Var8.e == null && vh0Var8.g.equals(str2)) {
                this.N = null;
                this.H = vh0Var7;
            }
            this.b.add(vh0Var7);
        }
        if (getMediaDataController().A0.f && this.H == null) {
            this.H = vh0Var4;
            this.I = true;
        }
        i0();
        i0();
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        ArrayList arrayList;
        TLRPC.Document document;
        TLRPC.Document document2;
        if (i7 == org.telegram.messenger.ks.g5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((vh0) arrayList.get(i11)).d), (vh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().A0.e.size(); i12++) {
                yf.b bVar = (yf.b) getMediaDataController().A0.e.get(i12);
                vh0 vh0Var = new vh0();
                vh0 vh0Var2 = (vh0) hashMap.get(Integer.valueOf(bVar.c));
                if (vh0Var2 != null) {
                    if (vh0Var2 == this.H) {
                        this.H = vh0Var;
                    }
                    vh0Var.c = vh0Var2.c;
                } else {
                    int i13 = this.G;
                    this.G = i13 + 1;
                    vh0Var.c = i13;
                }
                vh0Var.a = true;
                vh0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    vh0Var.f = document3.file_name_fixed;
                } else {
                    vh0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                vh0Var.e = document4;
                vh0Var.f = g0(document4, vh0Var.f);
                vh0Var.g = bVar.b;
                vh0 vh0Var3 = this.N;
                if (vh0Var3 != null && (document = vh0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = vh0Var;
                }
                arrayList.add(vh0Var);
            }
            i0();
            this.e.f();
            if (getMediaDataController().A0.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (vh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(vh0 vh0Var) {
        int i7 = vh0Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i7) != null) {
            sparseArray.remove(vh0Var.c);
        } else if (!vh0Var.a) {
            return;
        } else {
            sparseArray.put(vh0Var.c, vh0Var);
        }
        h0();
        di.l4 l4Var = this.e;
        l4Var.k(0, ((xh0) l4Var.d).h);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() <= 0) {
            this.simpleActionBar.w();
        } else {
            this.simpleActionBar.E(sparseArray.size(), this.simpleActionBar.x());
            this.simpleActionBar.J();
        }
    }

    public final void i0() {
        this.n = -1;
        this.r = -1;
        this.s = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.h = 1;
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            int i7 = this.h;
            this.n = i7;
            int size = arrayList.size() + i7;
            this.h = size;
            this.r = size;
        }
        int i10 = this.h;
        this.s = i10;
        this.h = i10 + 2;
        this.w = i10 + 1;
        ArrayList arrayList2 = this.b;
        if (!arrayList2.isEmpty()) {
            int i11 = this.h;
            int i12 = i11 + 1;
            this.h = i12;
            this.y = i11;
            this.E = i12;
            int size2 = arrayList2.size() + i12;
            this.h = size2;
            this.F = size2;
        }
        int i13 = this.h;
        this.h = i13 + 1;
        this.x = i13;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.ak
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().q2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.ks.g5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 != 21 || intent == null || this.O == null) {
            return;
        }
        Uri data = intent.getData();
        int i11 = org.telegram.messenger.ks.g5;
        boolean z10 = true;
        boolean z11 = false;
        if (data != null) {
            String T0 = org.telegram.messenger.g0.T0(intent.getData());
            if (T0 != null) {
                if (T0.startsWith("content://")) {
                    T0 = MediaController.t(-1L, intent.getData(), "mp3");
                }
                if (this.O.k2.R(new File(T0))) {
                    getMediaDataController().q2(T0);
                    getNotificationCenter().k(i11, new Object[0]);
                    z11 = z10;
                }
            }
            z10 = false;
            z11 = z10;
        } else if (intent.getClipData() != null) {
            ClipData clipData = intent.getClipData();
            boolean z12 = false;
            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                Uri uri = clipData.getItemAt(i12).getUri();
                String uri2 = uri.toString();
                if (uri2.startsWith("content://")) {
                    uri2 = MediaController.t(-1L, uri, "mp3");
                }
                if (this.O.k2.R(new File(uri2))) {
                    getMediaDataController().q2(uri2);
                    getNotificationCenter().k(i11, new Object[0]);
                    z12 = true;
                }
            }
            z11 = z12;
        }
        if (z11) {
            this.O.dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        String str;
        String str2;
        if (getArguments() != null) {
            this.L = getArguments().getLong("dialog_id", 0L);
            this.Q = getArguments().getLong("topic_id", 0L);
            this.M = getArguments().getInt(TeXSymbolParser.TYPE_ATTR, -1);
        }
        long j3 = this.L;
        if (j3 != 0) {
            String v = org.telegram.messenger.xs.v(j3, this.Q, false);
            str2 = p5.c.k("sound_document_id_", v);
            str = p5.c.k("sound_path_", v);
        } else {
            int i7 = this.M;
            if (i7 == 1) {
                str = "GlobalSoundPath";
                str2 = "GlobalSoundDocId";
            } else if (i7 == 0) {
                str = "GroupSoundPath";
                str2 = "GroupSoundDocId";
            } else if (i7 == 2) {
                str = "ChannelSoundPath";
                str2 = "ChannelSoundDocId";
            } else if (i7 == 3) {
                str = "StoriesSoundPath";
                str2 = "StoriesSoundDocId";
            } else {
                if (i7 != 4 && i7 != 5) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSoundPath";
                str2 = "ReactionSoundDocId";
            }
        }
        SharedPreferences notificationsSettings = getNotificationsSettings();
        long j10 = notificationsSettings.getLong(str2, 0L);
        String string = notificationsSettings.getString(str, "NoSound");
        vh0 vh0Var = new vh0();
        this.N = vh0Var;
        if (j10 != 0) {
            vh0Var.e = new TLRPC.TL_document();
            this.N.e.id = j10;
        } else {
            vh0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        String str;
        String str2;
        String str3;
        TLRPC.Document document;
        super.onFragmentDestroy();
        if (this.H == null || !this.I) {
            return;
        }
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        if (this.L != 0) {
            str = "sound_" + org.telegram.messenger.xs.v(this.L, this.Q, false);
            str2 = "sound_path_" + org.telegram.messenger.xs.v(this.L, this.Q, false);
            str3 = "sound_document_id_" + org.telegram.messenger.xs.v(this.L, this.Q, false);
            edit.putBoolean("sound_enabled_" + org.telegram.messenger.xs.v(this.L, this.Q, false), true);
        } else {
            int i7 = this.M;
            if (i7 == 1) {
                str = "GlobalSound";
                str2 = "GlobalSoundPath";
                str3 = "GlobalSoundDocId";
            } else if (i7 == 0) {
                str = "GroupSound";
                str2 = "GroupSoundPath";
                str3 = "GroupSoundDocId";
            } else if (i7 == 2) {
                str = "ChannelSound";
                str2 = "ChannelSoundPath";
                str3 = "ChannelSoundDocId";
            } else if (i7 == 3) {
                str = "StoriesSound";
                str2 = "StoriesSoundPath";
                str3 = "StoriesSoundDocId";
            } else {
                if (i7 != 5 && i7 != 4) {
                    throw new RuntimeException("Unsupported type");
                }
                str = "ReactionSound";
                str2 = "ReactionSoundPath";
                str3 = "ReactionSoundDocId";
            }
        }
        vh0 vh0Var = this.H;
        if (vh0Var.a && (document = vh0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.H.f);
            edit.putString(str2, "NoSound");
        } else if (vh0Var.g != null) {
            edit.putString(str, vh0Var.f);
            edit.putString(str2, this.H.g);
            edit.remove(str3);
        } else if (vh0Var.b) {
            edit.putString(str, "Default");
            edit.putString(str2, "Default");
            edit.remove(str3);
        } else {
            edit.putString(str, "NoSound");
            edit.putString(str2, "NoSound");
            edit.remove(str3);
        }
        edit.apply();
        if (this.L != 0) {
            getNotificationsController().c0(this.L, this.Q, true);
        } else {
            getNotificationsController().b0(this.M);
            getNotificationCenter().k(org.telegram.messenger.ks.f0, new Object[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.g5);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.ks.g5);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        org.telegram.ui.ActionBar.i6 i6Var = this.f;
        try {
            int w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.N6, i6Var);
            int w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.k7, i6Var);
            if (this.d != null) {
                if (w02 == this.R && w03 == this.S) {
                    return;
                }
                this.R = w02;
                this.S = w03;
                for (int i7 = 0; i7 < this.d.getChildCount(); i7++) {
                    f0(this.d.getChildAt(i7), w02, w03);
                }
                for (int i10 = 0; i10 < this.d.getCachedChildCount(); i10++) {
                    f0(this.d.P(i10), w02, w03);
                }
                for (int i11 = 0; i11 < this.d.getHiddenChildCount(); i11++) {
                    f0(this.d.V(i11), w02, w03);
                }
                for (int i12 = 0; i12 < this.d.getAttachedScrapChildCount(); i12++) {
                    f0(this.d.O(i12), w02, w03);
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.ak
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.ak
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
