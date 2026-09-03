package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wp0 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public final boolean B;
    public final zn C;
    public int D;
    public boolean E;
    public org.telegram.ui.ActionBar.p1 F;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout G;
    public org.telegram.ui.ActionBar.g1[] H;
    public FrameLayout I;
    public org.telegram.ui.Components.cu J;
    public n0 K;
    public ImageView L;
    public rp0 M;
    public eg.h0 N;
    public View O;
    public final TextPaint P;
    public final RectF Q;
    public final Paint R;
    public vp0 S;
    public CharSequence a;
    public final HashMap b;
    public final ArrayList c;
    public ArrayList d;
    public boolean e;
    public int f;
    public org.telegram.ui.Components.rl0 h;
    public up0 n;
    public FrameLayout r;
    public TextView s;
    public boolean v;
    public final int w;
    public boolean x;
    public final boolean y;

    public wp0(int i10, boolean z4, boolean z10, zn znVar) {
        super(null);
        this.b = new HashMap();
        this.c = new ArrayList();
        this.d = null;
        this.e = false;
        this.f = 2;
        this.x = true;
        this.E = true;
        this.P = new TextPaint(1);
        this.Q = new RectF();
        this.R = new Paint(1);
        this.C = znVar;
        this.w = i10;
        this.y = z4;
        this.B = z10;
    }

    public static void U(wp0 wp0Var, MediaController.AlbumEntry albumEntry) {
        if (albumEntry != null) {
            mq0 mq0Var = new mq0(0, albumEntry, wp0Var.b, wp0Var.c, wp0Var.w, wp0Var.B, wp0Var.C, false);
            Editable text = wp0Var.J.getText();
            wp0Var.a = text;
            mq0Var.d = text;
            org.telegram.ui.Components.cu cuVar = mq0Var.a0;
            if (cuVar != null) {
                cuVar.setText(text);
            }
            mq0Var.p0 = new sp0(wp0Var);
            mq0Var.f0(wp0Var.D, wp0Var.E);
            wp0Var.presentFragment(mq0Var);
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (!wp0Var.y) {
            mq0 mq0Var2 = new mq0(0, albumEntry, hashMap, arrayList, wp0Var.w, wp0Var.B, wp0Var.C, false);
            Editable text2 = wp0Var.J.getText();
            wp0Var.a = text2;
            mq0Var2.d = text2;
            org.telegram.ui.Components.cu cuVar2 = mq0Var2.a0;
            if (cuVar2 != null) {
                cuVar2.setText(text2);
            }
            mq0Var2.p0 = new pp0(wp0Var, hashMap, arrayList);
            mq0Var2.f0(wp0Var.D, wp0Var.E);
            wp0Var.presentFragment(mq0Var2);
            return;
        }
        rq0 rq0Var = new rq0(hashMap, arrayList, wp0Var.w, wp0Var.B, wp0Var.C);
        Editable text3 = wp0Var.J.getText();
        wp0Var.a = text3;
        mq0 mq0Var3 = rq0Var.a;
        if (mq0Var3 != null) {
            mq0Var3.d = text3;
            org.telegram.ui.Components.cu cuVar3 = mq0Var3.a0;
            if (cuVar3 != null) {
                cuVar3.setText(text3);
            }
        }
        tp0 tp0Var = new tp0(wp0Var, hashMap, arrayList);
        mq0 mq0Var4 = rq0Var.a;
        mq0Var4.p0 = tp0Var;
        mq0 mq0Var5 = rq0Var.b;
        mq0Var5.p0 = tp0Var;
        mq0Var4.q0 = new qq0(rq0Var, 0);
        mq0Var5.q0 = new qq0(rq0Var, 1);
        int i10 = wp0Var.D;
        boolean z4 = wp0Var.E;
        mq0Var4.f0(i10, z4);
        rq0Var.b.f0(i10, z4);
        wp0Var.presentFragment(rq0Var);
    }

    public final void V(HashMap hashMap, ArrayList arrayList, boolean z4, int i10) {
        if (hashMap.isEmpty() || this.S == null || this.v) {
            return;
        }
        this.v = true;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Object obj = hashMap.get(arrayList.get(i11));
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            arrayList2.add(sendingMediaInfo);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                String str = photoEntry.imagePath;
                if (str != null) {
                    sendingMediaInfo.path = str;
                } else {
                    sendingMediaInfo.path = photoEntry.path;
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                CharSequence charSequence = photoEntry.caption;
                sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
            } else if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                String str2 = searchImage.imagePath;
                if (str2 != null) {
                    sendingMediaInfo.path = str2;
                } else {
                    sendingMediaInfo.searchImage = searchImage;
                }
                sendingMediaInfo.thumbPath = searchImage.thumbPath;
                sendingMediaInfo.coverPath = searchImage.coverPath;
                sendingMediaInfo.videoEditedInfo = searchImage.editedInfo;
                CharSequence charSequence2 = searchImage.caption;
                sendingMediaInfo.caption = charSequence2 != null ? charSequence2.toString() : null;
                sendingMediaInfo.entities = searchImage.entities;
                sendingMediaInfo.masks = searchImage.stickers;
                sendingMediaInfo.ttl = searchImage.ttl;
                TLRPC.BotInlineResult botInlineResult = searchImage.inlineResult;
                if (botInlineResult != null && searchImage.type == 1) {
                    sendingMediaInfo.inlineResult = botInlineResult;
                    sendingMediaInfo.params = searchImage.params;
                }
                searchImage.date = (int) (System.currentTimeMillis() / 1000);
            }
        }
        this.S.a(arrayList2);
    }

    public final void W(boolean z4) {
        if (z4 == (this.I.getTag() != null)) {
            return;
        }
        this.I.setTag(z4 ? 1 : null);
        if (this.J.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.J.getEditText());
        }
        this.J.k(true);
        if (z4) {
            this.I.setVisibility(0);
            this.K.setVisibility(0);
        } else {
            this.I.setVisibility(4);
            this.K.setVisibility(4);
        }
        this.K.setScaleX(z4 ? 1.0f : 0.2f);
        this.K.setScaleY(z4 ? 1.0f : 0.2f);
        this.K.setAlpha(z4 ? 1.0f : 0.0f);
        this.N.setScaleX(z4 ? 1.0f : 0.2f);
        this.N.setScaleY(z4 ? 1.0f : 0.2f);
        this.N.setAlpha(z4 ? 1.0f : 0.0f);
        this.I.setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(48.0f));
        this.O.setTranslationY(z4 ? 0.0f : AndroidUtilities.dp(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        kVar.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        kVar2.setTitleColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.actionBar.C(org.telegram.ui.ActionBar.j6.w0(null, i11, false), false);
        this.actionBar.B(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I5, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new qp0(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        if (this.x) {
            n10.a(2, R.drawable.outline_header_search).setContentDescription(LocaleController.getString(R.string.Search));
        }
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        rp0 rp0Var = new rp0(this, context);
        this.M = rp0Var;
        rp0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.fragmentView = this.M;
        this.actionBar.setTitle(LocaleController.getString(R.string.Gallery));
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.h = rl0Var;
        rl0Var.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(54.0f));
        this.h.setClipToPadding(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setVerticalScrollBarEnabled(false);
        this.h.setLayoutManager(new f2.i0(1, false));
        this.h.setDrawingCacheEnabled(false);
        this.M.addView(this.h, k7.b6.e(-1, -1, 51));
        org.telegram.ui.Components.rl0 rl0Var2 = this.h;
        up0 up0Var = new up0(this, context);
        this.n = up0Var;
        rl0Var2.setAdapter(up0Var);
        this.h.setGlowColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextColor(-8355712);
        this.s.setTextSize(1, 20.0f);
        int i12 = 17;
        this.s.setGravity(17);
        this.s.setVisibility(8);
        this.s.setText(LocaleController.getString(R.string.NoPhotos));
        this.M.addView(this.s, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        this.s.setOnTouchListener(new oh.d(2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setVisibility(8);
        this.M.addView(this.r, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 48.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        radialProgressView.setProgressColor(-11371101);
        this.r.addView(radialProgressView, k7.b6.e(-2, -2, 17));
        View view = new View(context);
        this.O = view;
        view.setBackgroundResource(R.drawable.header_shadow_reverse);
        this.O.setTranslationY(AndroidUtilities.dp(48.0f));
        this.M.addView(this.O, k7.b6.d(-1, 3.0f, 83, 0.0f, 0.0f, 0.0f, 48.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.I = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.I.setVisibility(4);
        this.I.setTranslationY(AndroidUtilities.dp(48.0f));
        this.M.addView(this.I, k7.b6.e(-1, 48, 83));
        this.I.setOnTouchListener(new oh.d(2));
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar != null) {
            cuVar.o();
        }
        this.J = new org.telegram.ui.Components.cu(context, this.M, null, 1, false, null);
        this.J.setFilters(new InputFilter[]{new InputFilter.LengthFilter(MessagesController.getInstance(UserConfig.selectedAccount).maxCaptionLength)});
        this.J.setHint(LocaleController.getString(R.string.AddCaption));
        org.telegram.ui.Components.ut editText = this.J.getEditText();
        editText.setMaxLines(1);
        editText.setSingleLine(true);
        this.I.addView(this.J, k7.b6.d(-1, -1.0f, 51, 0.0f, 0.0f, 84.0f, 0.0f));
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            this.J.setText(charSequence);
        }
        n0 n0Var = new n0(this, context, 16);
        this.K = n0Var;
        n0Var.setFocusable(true);
        this.K.setFocusableInTouchMode(true);
        this.K.setVisibility(4);
        this.K.setScaleX(0.2f);
        this.K.setScaleY(0.2f);
        this.K.setAlpha(0.0f);
        this.M.addView(this.K, k7.b6.d(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        this.L = new ImageView(context);
        this.L.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.S5, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.T5, false)));
        this.L.setImageResource(R.drawable.attach_send);
        this.L.setImportantForAccessibility(2);
        this.L.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.U5, false), PorterDuff.Mode.MULTIPLY));
        this.L.setScaleType(ImageView.ScaleType.CENTER);
        this.L.setOutlineProvider(new gg.j1(15));
        this.K.addView(this.L, k7.b6.d(56, 56.0f, 51, 2.0f, 0.0f, 0.0f, 0.0f));
        this.L.setOnClickListener(new g60(this, i12));
        this.L.setOnLongClickListener(new w(this, 3));
        float dp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.P;
        textPaint.setTextSize(dp);
        textPaint.setTypeface(AndroidUtilities.bold());
        eg.h0 h0Var = new eg.h0(this, context, 27);
        this.N = h0Var;
        h0Var.setAlpha(0.0f);
        this.N.setScaleX(0.2f);
        this.N.setScaleY(0.2f);
        this.M.addView(this.N, k7.b6.d(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        if (this.w != 0) {
            this.J.setVisibility(8);
        }
        if (this.e && ((arrayList = this.d) == null || arrayList.isEmpty())) {
            this.r.setVisibility(0);
            this.h.setEmptyView(null);
        } else {
            this.r.setVisibility(8);
            this.h.setEmptyView(this.s);
        }
        return this.fragmentView;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.albumsDidLoad) {
            if (i10 == NotificationCenter.closeChats) {
                removeSelfFromStack(true);
                return;
            }
            return;
        }
        if (this.classGuid == ((Integer) objArr[0]).intValue()) {
            int i12 = this.w;
            if (i12 == 1 || i12 == 2 || i12 == 10 || !this.x) {
                this.d = (ArrayList) objArr[2];
            } else {
                this.d = (ArrayList) objArr[1];
            }
            FrameLayout frameLayout = this.r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
            }
            org.telegram.ui.Components.rl0 rl0Var = this.h;
            if (rl0Var != null && rl0Var.getEmptyView() == null) {
                this.h.setEmptyView(this.s);
            }
            up0 up0Var = this.n;
            if (up0Var != null) {
                up0Var.l();
            }
            this.e = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.j6.h5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, i10));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.j6.j5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 64, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, new Drawable[]{org.telegram.ui.ActionBar.j6.R4}, null, org.telegram.ui.ActionBar.j6.da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 0, new Class[]{View.class}, null, null, null, org.telegram.ui.ActionBar.j6.X9));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar == null || !cuVar.e) {
            return super.onBackPressed(z4);
        }
        if (!z4) {
            return false;
        }
        cuVar.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.ui.Components.rl0 rl0Var = this.h;
        if (rl0Var != null) {
            rl0Var.getViewTreeObserver().addOnPreDrawListener(new ci(this, 3));
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        int i10 = this.w;
        if (i10 == 1 || i10 == 2 || i10 == 10 || !this.x) {
            this.d = MediaController.allPhotoAlbums;
        } else {
            this.d = MediaController.allMediaAlbums;
        }
        this.e = this.d == null;
        MediaController.loadGalleryPhotosAlbums(this.classGuid);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar != null) {
            cuVar.o();
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        up0 up0Var = this.n;
        if (up0Var != null) {
            up0Var.l();
        }
        org.telegram.ui.Components.cu cuVar = this.J;
        if (cuVar != null) {
            cuVar.s();
        }
        org.telegram.ui.Components.rl0 rl0Var = this.h;
        if (rl0Var != null) {
            rl0Var.getViewTreeObserver().addOnPreDrawListener(new ci(this, 3));
        }
    }
}
