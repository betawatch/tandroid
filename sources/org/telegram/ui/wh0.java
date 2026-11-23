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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wh0 extends org.telegram.ui.ActionBar.g2 implements org.telegram.ui.Components.bk, org.telegram.messenger.fs {
    public int E;
    public int F;
    public int G;
    public uh0 H;
    public boolean I;
    public final SparseArray J;
    public org.telegram.ui.Components.zn K;
    public long L;
    public int M;
    public uh0 N;
    public org.telegram.ui.Components.ti O;
    public Ringtone P;
    public long Q;
    public int R;
    public int S;
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public org.telegram.ui.Components.ek0 d;
    public di.l4 e;
    public final org.telegram.ui.ActionBar.i6 f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public wh0(Bundle bundle, org.telegram.ui.ActionBar.i6 i6Var) {
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
    public static void Z(wh0 wh0Var, Context context, View view, int i7) {
        wh0 wh0Var2;
        Context context2;
        File file;
        if (i7 == wh0Var.s) {
            wh0Var2 = wh0Var;
            context2 = context;
            org.telegram.ui.Components.ti tiVar = new org.telegram.ui.Components.ti(context2, wh0Var2, false, false, true, wh0Var.f);
            wh0Var2.O = tiVar;
            tiVar.I1 = true;
            tiVar.v3.setVisibility(8);
            tiVar.h3.setText(org.telegram.messenger.gd.N0(2131752109, null));
            wh0Var2.O.f1();
            wh0Var2.O.show();
        } else {
            wh0Var2 = wh0Var;
            context2 = context;
        }
        if (view instanceof vh0) {
            vh0 vh0Var = (vh0) view;
            if (wh0Var2.simpleActionBar.x() || vh0Var.e == null) {
                wh0Var2.e0(vh0Var.e);
                return;
            }
            Ringtone ringtone = wh0Var2.P;
            if (ringtone != null) {
                ringtone.stop();
            }
            try {
                uh0 uh0Var = vh0Var.e;
                if (uh0Var.b) {
                    Ringtone ringtone2 = RingtoneManager.getRingtone(context2.getApplicationContext(), RingtoneManager.getDefaultUri(2));
                    ringtone2.setStreamType(4);
                    wh0Var2.P = ringtone2;
                    ringtone2.play();
                } else {
                    String str = uh0Var.g;
                    if (str != null && !uh0Var.a) {
                        Ringtone ringtone3 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(vh0Var.e.g));
                        ringtone3.setStreamType(4);
                        wh0Var2.P = ringtone3;
                        ringtone3.play();
                    } else if (uh0Var.a) {
                        if (!TextUtils.isEmpty(str)) {
                            file = new File(vh0Var.e.g);
                            if (file.exists()) {
                                if (file == null) {
                                    org.telegram.messenger.w7 fileLoader = wh0Var2.getFileLoader();
                                    TLRPC.Document document = vh0Var.e.e;
                                    fileLoader.getClass();
                                    file = org.telegram.messenger.w7.I(document);
                                }
                                if (file == null && file.exists()) {
                                    Ringtone ringtone4 = RingtoneManager.getRingtone(context2.getApplicationContext(), Uri.parse(file.toString()));
                                    ringtone4.setStreamType(4);
                                    wh0Var2.P = ringtone4;
                                    ringtone4.play();
                                } else {
                                    org.telegram.messenger.w7 fileLoader2 = wh0Var2.getFileLoader();
                                    TLRPC.Document document2 = vh0Var.e.e;
                                    fileLoader2.W(document2, document2, 3, 0);
                                }
                            }
                        }
                        file = null;
                        if (file == null) {
                        }
                        if (file == null) {
                        }
                        org.telegram.messenger.w7 fileLoader22 = wh0Var2.getFileLoader();
                        TLRPC.Document document22 = vh0Var.e.e;
                        fileLoader22.W(document22, document22, 3, 0);
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            wh0Var2.N = null;
            wh0Var2.H = vh0Var.e;
            wh0Var2.I = true;
            di.l4 l4Var = wh0Var2.e;
            l4Var.k(0, ((wh0) l4Var.d).h);
        }
    }

    public static void b0(wh0 wh0Var) {
        wh0Var.J.clear();
        di.l4 l4Var = wh0Var.e;
        l4Var.k(0, ((wh0) l4Var.d).h);
        wh0Var.h0();
    }

    public static void f0(View view, int i7, int i10) {
        if (view instanceof org.telegram.ui.Cells.j2) {
            org.telegram.ui.Cells.j2 j2Var = (org.telegram.ui.Cells.j2) view;
            for (int i11 = 0; i11 < j2Var.getChildCount(); i11++) {
                View childAt = j2Var.getChildAt(i11);
                if (childAt instanceof ImageView) {
                    ImageView imageView = (ImageView) childAt;
                    if (imageView.getDrawable() instanceof org.telegram.ui.Components.lq) {
                        org.telegram.ui.Components.lq lqVar = (org.telegram.ui.Components.lq) imageView.getDrawable();
                        Drawable drawable = lqVar.a;
                        if (drawable != null) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
                        }
                        Drawable drawable2 = lqVar.b;
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
        return (!TextUtils.isEmpty(str) || document == null) ? str : org.telegram.messenger.gd.a0("SoundNameEmpty", null, 2131745082, org.telegram.messenger.gd.u(document.date, true));
    }

    @Override // org.telegram.ui.Components.bk
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

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        TLRPC.Document document;
        TLRPC.Document document2;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new th0(this, context));
        if (this.L == 0) {
            int i7 = this.M;
            if (i7 == 1) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747674, null));
            } else if (i7 == 0) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747675, null));
            } else if (i7 == 2) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747676, null));
            } else if (i7 == 3) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747672, null));
            } else if (i7 == 5 || i7 == 4) {
                this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131747673, null));
            }
        } else {
            this.K = new org.telegram.ui.Components.zn(context, null, false, this.f);
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
            this.simpleActionBar.setSubtitle(org.telegram.messenger.gd.N0(2131747677, null));
            org.telegram.messenger.g0.E2(this.K.e);
            this.simpleActionBar.addView(this.K.e, c8.na.d(42, 42.0f, 5, 0.0f, 0.0f, 8.0f, 0.0f));
        }
        org.telegram.ui.ActionBar.f5 q10 = this.simpleActionBar.q();
        q10.d(2, R.drawable.msg_forward, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131745263, null));
        q10.d(1, R.drawable.msg_delete, org.telegram.messenger.g0.L(54.0f), org.telegram.messenger.gd.N0(2131751586, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.d = ek0Var;
        ek0Var.r1();
        this.d.setSectionsDrawBackground(true);
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        di.l4 l4Var = new di.l4(this, 8);
        this.e = l4Var;
        l4Var.C(true);
        this.d.setAdapter(this.e);
        ((v4.l) this.d.getItemAnimator()).m = false;
        ((v4.l) this.d.getItemAnimator()).C = false;
        this.d.setLayoutManager(new v4.c0());
        this.d.setOnItemClickListener(new fi.g4(20, this, context));
        this.d.setOnItemLongClickListener(new zr(this, 27));
        getMediaDataController().A0.g(false);
        this.a.clear();
        this.b.clear();
        for (int i10 = 0; i10 < getMediaDataController().A0.e.size(); i10++) {
            yf.b bVar = (yf.b) getMediaDataController().A0.e.get(i10);
            uh0 uh0Var = new uh0();
            int i11 = this.G;
            this.G = i11 + 1;
            uh0Var.c = i11;
            uh0Var.a = true;
            uh0Var.d = bVar.c;
            TLRPC.Document document3 = bVar.a;
            String str = document3.file_name_fixed;
            uh0Var.f = str;
            uh0Var.e = document3;
            uh0Var.f = g0(document3, str);
            uh0Var.g = bVar.b;
            uh0 uh0Var2 = this.N;
            if (uh0Var2 != null && (document = uh0Var2.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                this.N = null;
                this.H = uh0Var;
            }
            this.a.add(uh0Var);
        }
        RingtoneManager ringtoneManager = new RingtoneManager(org.telegram.messenger.t0.b);
        ringtoneManager.setType(2);
        Cursor cursor = ringtoneManager.getCursor();
        uh0 uh0Var3 = new uh0();
        int i12 = this.G;
        this.G = i12 + 1;
        uh0Var3.c = i12;
        uh0Var3.f = org.telegram.messenger.gd.N0(2131747958, null);
        this.b.add(uh0Var3);
        uh0 uh0Var4 = new uh0();
        int i13 = this.G;
        this.G = i13 + 1;
        uh0Var4.c = i13;
        uh0Var4.f = org.telegram.messenger.gd.N0(2131751587, null);
        uh0Var4.b = true;
        this.b.add(uh0Var4);
        uh0 uh0Var5 = this.N;
        if (uh0Var5 != null && uh0Var5.e == null && uh0Var5.g.equals("NoSound")) {
            this.N = null;
            this.H = uh0Var3;
        }
        uh0 uh0Var6 = this.N;
        if (uh0Var6 != null && uh0Var6.e == null && uh0Var6.g.equals("Default")) {
            this.N = null;
            this.H = uh0Var4;
        }
        while (cursor.moveToNext()) {
            String string = cursor.getString(1);
            String str2 = cursor.getString(2) + "/" + cursor.getString(0);
            uh0 uh0Var7 = new uh0();
            int i14 = this.G;
            this.G = i14 + 1;
            uh0Var7.c = i14;
            uh0Var7.f = string;
            uh0Var7.g = str2;
            uh0 uh0Var8 = this.N;
            if (uh0Var8 != null && uh0Var8.e == null && uh0Var8.g.equals(str2)) {
                this.N = null;
                this.H = uh0Var7;
            }
            this.b.add(uh0Var7);
        }
        if (getMediaDataController().A0.f && this.H == null) {
            this.H = uh0Var4;
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
        if (i7 == org.telegram.messenger.ks.h5) {
            HashMap hashMap = new HashMap();
            int i11 = 0;
            while (true) {
                arrayList = this.a;
                if (i11 >= arrayList.size()) {
                    break;
                }
                hashMap.put(Integer.valueOf(((uh0) arrayList.get(i11)).d), (uh0) arrayList.get(i11));
                i11++;
            }
            arrayList.clear();
            for (int i12 = 0; i12 < getMediaDataController().A0.e.size(); i12++) {
                yf.b bVar = (yf.b) getMediaDataController().A0.e.get(i12);
                uh0 uh0Var = new uh0();
                uh0 uh0Var2 = (uh0) hashMap.get(Integer.valueOf(bVar.c));
                if (uh0Var2 != null) {
                    if (uh0Var2 == this.H) {
                        this.H = uh0Var;
                    }
                    uh0Var.c = uh0Var2.c;
                } else {
                    int i13 = this.G;
                    this.G = i13 + 1;
                    uh0Var.c = i13;
                }
                uh0Var.a = true;
                uh0Var.d = bVar.c;
                TLRPC.Document document3 = bVar.a;
                if (document3 != null) {
                    uh0Var.f = document3.file_name_fixed;
                } else {
                    uh0Var.f = new File(bVar.b).getName();
                }
                TLRPC.Document document4 = bVar.a;
                uh0Var.e = document4;
                uh0Var.f = g0(document4, uh0Var.f);
                uh0Var.g = bVar.b;
                uh0 uh0Var3 = this.N;
                if (uh0Var3 != null && (document = uh0Var3.e) != null && (document2 = bVar.a) != null && document.id == document2.id) {
                    this.N = null;
                    this.H = uh0Var;
                }
                arrayList.add(uh0Var);
            }
            i0();
            this.e.f();
            if (getMediaDataController().A0.f && this.H == null) {
                ArrayList arrayList2 = this.b;
                if (arrayList2.size() > 0) {
                    this.N = null;
                    this.H = (uh0) arrayList2.get(0);
                }
            }
        }
    }

    public final void e0(uh0 uh0Var) {
        int i7 = uh0Var.c;
        SparseArray sparseArray = this.J;
        if (sparseArray.get(i7) != null) {
            sparseArray.remove(uh0Var.c);
        } else if (!uh0Var.a) {
            return;
        } else {
            sparseArray.put(uh0Var.c, uh0Var);
        }
        h0();
        di.l4 l4Var = this.e;
        l4Var.k(0, ((wh0) l4Var.d).h);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.ActionBar.i6 getResourceProvider() {
        return this.f;
    }

    public final void h0() {
        SparseArray sparseArray = this.J;
        if (sparseArray.size() <= 0) {
            this.simpleActionBar.w();
        } else {
            this.simpleActionBar.D(sparseArray.size(), this.simpleActionBar.x());
            this.simpleActionBar.I();
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.Components.bk
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i7, long j3, boolean z11, long j10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            getMediaDataController().q2((String) arrayList.get(i10));
        }
        getNotificationCenter().k(org.telegram.messenger.ks.h5, new Object[0]);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        if (i7 != 21 || intent == null || this.O == null) {
            return;
        }
        Uri data = intent.getData();
        int i11 = org.telegram.messenger.ks.h5;
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

    @Override // org.telegram.ui.ActionBar.g2
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
        uh0 uh0Var = new uh0();
        this.N = uh0Var;
        if (j10 != 0) {
            uh0Var.e = new TLRPC.TL_document();
            this.N.e.id = j10;
        } else {
            uh0Var.g = string;
        }
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.g2
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
        uh0 uh0Var = this.H;
        if (uh0Var.a && (document = uh0Var.e) != null) {
            edit.putLong(str3, document.id);
            edit.putString(str, this.H.f);
            edit.putString(str2, "NoSound");
        } else if (uh0Var.g != null) {
            edit.putString(str, uh0Var.f);
            edit.putString(str2, this.H.g);
            edit.remove(str3);
        } else if (uh0Var.b) {
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

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        getNotificationCenter().n(this, org.telegram.messenger.ks.h5);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        getNotificationCenter().c(this, org.telegram.messenger.ks.h5);
    }

    @Override // org.telegram.ui.ActionBar.g2
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override // org.telegram.ui.Components.bk
    public final /* synthetic */ void T() {
    }

    @Override // org.telegram.ui.Components.bk
    public final /* synthetic */ void p(ArrayList arrayList, boolean z10, int i7, long j3) {
    }
}
