package qh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cl0;
import org.telegram.ui.h51;
import org.telegram.ui.hb0;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class z2 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry g0 = new MediaController.AlbumEntry(-1, null, null);
    public final Drawable B;
    public final q2 C;
    public final org.telegram.ui.ActionBar.w0 D;
    public final ImageView E;
    public final LinearLayout F;
    public final d G;
    public boolean H;
    public final boolean I;
    public final boolean J;
    public int K;
    public final float L;
    public final boolean M;
    public boolean N;
    public int O;
    public final org.telegram.ui.Components.z5 P;
    public boolean Q;
    public boolean R;
    public Runnable S;
    public Utilities.Callback2 T;
    public Utilities.Callback3 U;
    public final ArrayList V;
    public boolean W;
    public final int a;
    public boolean a0;
    public final org.telegram.ui.ActionBar.g6 b;
    public MediaController.AlbumEntry b0;
    public final Paint c;
    public ArrayList c0;
    public final k2 d;
    public ArrayList d0;
    public final l2 e;
    public final ArrayList e0;
    public final u2 f;
    public h51 f0;
    public final FrameLayout h;
    public final sl0 n;
    public final r2 r;
    public final zw0 s;
    public final h3 v;
    public boolean w;
    public final org.telegram.ui.ActionBar.k x;
    public final TextView y;

    public z2(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, MediaController.AlbumEntry albumEntry, boolean z4, float f10, boolean z10, boolean z11) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.K = -2;
        this.P = new org.telegram.ui.Components.z5(this, 0L, 350L, pr.h);
        this.R = true;
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        this.e0 = new ArrayList();
        this.L = f10;
        this.a = i10;
        this.b = g6Var;
        this.I = z4;
        this.J = z10;
        this.M = z11;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), TLObject.FLAG_27);
        k2 k2Var = new k2(this, context, g6Var);
        this.d = k2Var;
        k2Var.setItemSelectorColorProvider(new cl0(17));
        u2 u2Var = new u2(this);
        this.f = u2Var;
        k2Var.setAdapter(u2Var);
        l2 l2Var = new l2(this);
        this.e = l2Var;
        k2Var.setLayoutManager(l2Var);
        k2Var.setFastScrollEnabled(1);
        k2Var.setFastScrollVisible(true);
        k2Var.getFastScroll().setAlpha(0.0f);
        l2Var.O = new m2(this);
        k2Var.i(new n2());
        k2Var.setClipToPadding(false);
        addView(k2Var, k7.c6.e(-1, -1, 119));
        final int i11 = 0;
        k2Var.setOnItemClickListener(new il0(this) { // from class: qh.d2
            public final /* synthetic */ z2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i12, View view) {
                Utilities.Callback2 callback2;
                switch (i11) {
                    case 0:
                        z2 z2Var = this.b;
                        ArrayList arrayList2 = z2Var.V;
                        ArrayList arrayList3 = z2Var.e0;
                        if (i12 >= 2 && z2Var.T != null && (view instanceof w2)) {
                            w2 w2Var = (w2) view;
                            int i13 = i12 - 2;
                            if (!z2Var.W) {
                                if (z2Var.a0) {
                                    if (i13 >= 0 && i13 < arrayList2.size()) {
                                        r6 r6Var = (r6) arrayList2.get(i13);
                                        z2Var.T.run(r6Var, r6Var.K ? z2.d(w2Var) : null);
                                        break;
                                    } else {
                                        i13 -= arrayList2.size();
                                    }
                                }
                            } else if (i13 == 0) {
                                z2Var.e(z2.g0, true);
                                break;
                            } else {
                                i13 = i12 - 3;
                            }
                            if (i13 >= 0 && i13 < z2Var.c0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) z2Var.c0.get(i13);
                                if (arrayList3.isEmpty() && !z2Var.N) {
                                    Utilities.Callback2 callback22 = z2Var.T;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = z2.d(w2Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > z2Var.O) {
                                        int i14 = -z2Var.K;
                                        z2Var.K = i14;
                                        AndroidUtilities.shakeViewSpring(w2Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(z2Var.d);
                                    z2Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        z2 z2Var2 = this.b;
                        r2 r2Var = z2Var2.r;
                        org.telegram.ui.ActionBar.w0 w0Var = z2Var2.D;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i12 >= 0 && i12 < r2Var.c.size() && (callback2 = z2Var2.T) != null) {
                            callback2.run(r2Var.c.get(i12), null);
                            break;
                        }
                        break;
                }
            }
        });
        k2Var.setOnItemLongClickListener(new mh.m5(this, 25));
        k2Var.setOnScrollListener(new o2(this));
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var);
        this.x = kVar;
        kVar.setBackgroundColor(-14737633);
        kVar.setTitleColor(-1);
        kVar.setAlpha(0.0f);
        kVar.setVisibility(8);
        kVar.setBackButtonImage(R.drawable.ic_ab_back);
        kVar.B(436207615, false);
        kVar.C(-1, false);
        kVar.C(-1, true);
        addView(kVar, k7.c6.e(-1, -2, 55));
        kVar.setActionBarMenuOnItemClick(new p2(this));
        org.telegram.ui.ActionBar.z n10 = kVar.n();
        q2 q2Var = new q2(this, context, n10, g6Var);
        this.C = q2Var;
        q2Var.setSubMenuOpenSide(1);
        kVar.addView(q2Var, 0, k7.c6.d(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        final int i12 = 0;
        q2Var.setOnClickListener(new View.OnClickListener(this) { // from class: qh.e2
            public final /* synthetic */ z2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.C.M(null, null);
                        break;
                    case 1:
                        z2 z2Var = this.b;
                        if (z2Var.F.getAlpha() >= 0.25f) {
                            z2Var.f(false);
                            break;
                        }
                        break;
                    case 2:
                        z2 z2Var2 = this.b;
                        if (z2Var2.F.getAlpha() >= 0.25f) {
                            z2Var2.f(true);
                            break;
                        }
                        break;
                    default:
                        this.b.f(false);
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.y = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.B = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        q2Var.addView(textView, k7.c6.d(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.h = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, k7.c6.e(-1, -1, 119));
        sl0 sl0Var = new sl0(context, g6Var);
        this.n = sl0Var;
        sl0Var.setLayoutManager(new f2.w(3));
        r2 r2Var = new r2(this);
        this.r = r2Var;
        sl0Var.setAdapter(r2Var);
        sl0Var.setOnScrollListener(new s2(this));
        sl0Var.setClipToPadding(true);
        sl0Var.i(new f2());
        frameLayout.addView(sl0Var, k7.c6.e(-1, -1, 119));
        g2 g2Var = new g2(context, g6Var);
        g2Var.setViewType(2);
        g2Var.setAlpha(0.0f);
        g2Var.setVisibility(8);
        frameLayout.addView(g2Var, k7.c6.e(-1, -1, 119));
        zw0 zw0Var = new zw0(context, g2Var, 11, g6Var);
        this.s = zw0Var;
        jh.s sVar = zw0Var.d;
        sVar.setTextSize(1, 16.0f);
        sVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.y6, g6Var));
        sVar.setTypeface(null);
        sVar.setText(LocaleController.getString(R.string.SearchImagesType));
        this.v = new h3(this, false, new org.telegram.ui.web.d1(this, 7));
        frameLayout.addView(zw0Var, k7.c6.e(-1, -1, 119));
        sl0Var.setEmptyView(zw0Var);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new j2(this);
        this.D = a2;
        a2.setVisibility(8);
        a2.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        final int i13 = 1;
        sl0Var.setOnItemClickListener(new il0(this) { // from class: qh.d2
            public final /* synthetic */ z2 b;

            {
                this.b = this;
            }

            @Override // org.telegram.ui.Components.il0
            public final void f(int i122, View view) {
                Utilities.Callback2 callback2;
                switch (i13) {
                    case 0:
                        z2 z2Var = this.b;
                        ArrayList arrayList2 = z2Var.V;
                        ArrayList arrayList3 = z2Var.e0;
                        if (i122 >= 2 && z2Var.T != null && (view instanceof w2)) {
                            w2 w2Var = (w2) view;
                            int i132 = i122 - 2;
                            if (!z2Var.W) {
                                if (z2Var.a0) {
                                    if (i132 >= 0 && i132 < arrayList2.size()) {
                                        r6 r6Var = (r6) arrayList2.get(i132);
                                        z2Var.T.run(r6Var, r6Var.K ? z2.d(w2Var) : null);
                                        break;
                                    } else {
                                        i132 -= arrayList2.size();
                                    }
                                }
                            } else if (i132 == 0) {
                                z2Var.e(z2.g0, true);
                                break;
                            } else {
                                i132 = i122 - 3;
                            }
                            if (i132 >= 0 && i132 < z2Var.c0.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) z2Var.c0.get(i132);
                                if (arrayList3.isEmpty() && !z2Var.N) {
                                    Utilities.Callback2 callback22 = z2Var.T;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                                        r5 = z2.d(w2Var);
                                    }
                                    callback22.run(photoEntry, r5);
                                    break;
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > z2Var.O) {
                                        int i14 = -z2Var.K;
                                        z2Var.K = i14;
                                        AndroidUtilities.shakeViewSpring(w2Var, i14);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                        break;
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(z2Var.d);
                                    z2Var.j();
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        z2 z2Var2 = this.b;
                        r2 r2Var2 = z2Var2.r;
                        org.telegram.ui.ActionBar.w0 w0Var = z2Var2.D;
                        if (w0Var != null) {
                            AndroidUtilities.hideKeyboard(w0Var.getSearchContainer());
                        }
                        if (i122 >= 0 && i122 < r2Var2.c.size() && (callback2 = z2Var2.T) != null) {
                            callback2.run(r2Var2.c.get(i122), null);
                            break;
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z4) {
            ArrayList arrayList2 = MessagesController.getInstance(i10).getStoriesController().w.b;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList2.get(i14);
                i14++;
                r6 r6Var = (r6) obj;
                if (!r6Var.g && !r6Var.w) {
                    this.V.add(r6Var);
                }
            }
        }
        if (z10) {
            this.E = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.F = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, g6Var));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, k7.c6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
            this.G = p10;
            p10.g(LocaleController.formatPluralStringComma("StoriesCreate", 1), false, true);
            if (!z11) {
                linearLayout.addView(p10, k7.c6.k(0.0f, 0.0f, 0.0f, 8.0f, -1, 48));
                final int i15 = 1;
                p10.setOnClickListener(new View.OnClickListener(this) { // from class: qh.e2
                    public final /* synthetic */ z2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.b.C.M(null, null);
                                break;
                            case 1:
                                z2 z2Var = this.b;
                                if (z2Var.F.getAlpha() >= 0.25f) {
                                    z2Var.f(false);
                                    break;
                                }
                                break;
                            case 2:
                                z2 z2Var2 = this.b;
                                if (z2Var2.F.getAlpha() >= 0.25f) {
                                    z2Var2.f(true);
                                    break;
                                }
                                break;
                            default:
                                this.b.f(false);
                                break;
                        }
                    }
                });
            }
            d p11 = org.telegram.messenger.y3.p(24, context, g6Var, z11);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            oq oqVar = new oq(R.drawable.mini_collage, 0);
            oqVar.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(oqVar, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            p11.g(spannableStringBuilder, false, true);
            linearLayout.addView(p11, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, 48));
            final int i16 = 2;
            p11.setOnClickListener(new View.OnClickListener(this) { // from class: qh.e2
                public final /* synthetic */ z2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            this.b.C.M(null, null);
                            break;
                        case 1:
                            z2 z2Var = this.b;
                            if (z2Var.F.getAlpha() >= 0.25f) {
                                z2Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            z2 z2Var2 = this.b;
                            if (z2Var2.F.getAlpha() >= 0.25f) {
                                z2Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
        } else {
            this.F = null;
            this.G = null;
            ImageView imageView = new ImageView(context);
            this.E = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(56.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var)));
            k7.e6.b(imageView, 0.1f, 1.5f);
            addView(imageView, k7.c6.d(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i17 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) { // from class: qh.e2
                public final /* synthetic */ z2 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i17) {
                        case 0:
                            this.b.C.M(null, null);
                            break;
                        case 1:
                            z2 z2Var = this.b;
                            if (z2Var.F.getAlpha() >= 0.25f) {
                                z2Var.f(false);
                                break;
                            }
                            break;
                        case 2:
                            z2 z2Var2 = this.b;
                            if (z2Var2.F.getAlpha() >= 0.25f) {
                                z2Var2.f(true);
                                break;
                            }
                            break;
                        default:
                            this.b.f(false);
                            break;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        h();
        MediaController.AlbumEntry albumEntry2 = g0;
        if (albumEntry == null || (albumEntry == albumEntry2 && this.V.size() <= 0)) {
            ArrayList arrayList3 = this.d0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.b0 = MediaController.allMediaAlbumEntry;
            } else {
                this.b0 = (MediaController.AlbumEntry) this.d0.get(0);
            }
        } else {
            this.b0 = albumEntry;
        }
        this.c0 = b(this.b0);
        i();
        MediaController.AlbumEntry albumEntry3 = this.b0;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.y.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.y.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.y.setText(albumEntry3.bucketName);
        }
    }

    public static Bitmap d(w2 w2Var) {
        Bitmap bitmap;
        if (w2Var == null || (bitmap = w2Var.a) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
    }

    public final ArrayList b(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < albumEntry.photos.size(); i10++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i10);
            if (!this.I || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.albumsDidLoad;
        u2 u2Var = this.f;
        int i13 = 0;
        if (i10 != i12) {
            if (i10 == NotificationCenter.storiesDraftsUpdated) {
                ArrayList arrayList = this.V;
                arrayList.clear();
                if (!this.I) {
                    ArrayList arrayList2 = MessagesController.getInstance(this.a).getStoriesController().w.b;
                    int size = arrayList2.size();
                    while (i13 < size) {
                        Object obj = arrayList2.get(i13);
                        i13++;
                        r6 r6Var = (r6) obj;
                        if (!r6Var.g && !r6Var.w) {
                            arrayList.add(r6Var);
                        }
                    }
                }
                h();
                i();
                if (u2Var != null) {
                    u2Var.l();
                    return;
                }
                return;
            }
            return;
        }
        h();
        if (this.b0 != null) {
            while (true) {
                if (i13 >= MediaController.allMediaAlbums.size()) {
                    break;
                }
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i13);
                int i14 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.b0;
                if (i14 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.b0 = albumEntry;
                    break;
                }
                i13++;
            }
        } else {
            ArrayList arrayList3 = this.d0;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.b0 = MediaController.allMediaAlbumEntry;
            } else {
                this.b0 = (MediaController.AlbumEntry) this.d0.get(0);
            }
        }
        this.c0 = b(this.b0);
        this.e0.clear();
        i();
        if (u2Var != null) {
            u2Var.l();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float g10 = g();
        boolean z4 = g10 <= ((float) l.d.c(32.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0));
        float e6 = this.P.e(z4);
        float lerp = AndroidUtilities.lerp(g10, 0.0f, e6);
        if (z4 != this.w) {
            this.w = z4;
            c(z4);
            this.d.getFastScroll().animate().alpha(this.w ? 1.0f : 0.0f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.x;
        if (kVar != null) {
            kVar.setAlpha(e6);
            int i10 = e6 <= 0.0f ? 8 : 0;
            if (kVar.getVisibility() != i10) {
                kVar.setVisibility(i10);
            }
        }
        h51 h51Var = this.f0;
        if (h51Var != null) {
            h51Var.setAlpha(1.0f - e6);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, lerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.c);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final void e(MediaController.AlbumEntry albumEntry, boolean z4) {
        this.b0 = albumEntry;
        this.c0 = b(albumEntry);
        this.e0.clear();
        i();
        MediaController.AlbumEntry albumEntry2 = this.b0;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.y;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == g0) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.f.l();
        l2 l2Var = this.e;
        if (!z4) {
            l2Var.h1(1, AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            return;
        }
        xh.o oVar = new xh.o(getContext(), 2);
        oVar.a = 1;
        oVar.p = AndroidUtilities.dp(16.0f) + (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight());
        l2Var.w0(oVar);
    }

    public final void f(boolean z4) {
        Bitmap bitmap;
        w2 w2Var;
        if (this.U == null) {
            return;
        }
        ArrayList arrayList = this.e0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.T.run((MediaController.PhotoEntry) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            k2 k2Var = this.d;
            if (i10 >= size) {
                this.U.run(Boolean.valueOf(z4), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                AndroidUtilities.updateVisibleRows(k2Var);
                j();
                return;
            }
            Object obj = arrayList.get(i10);
            i10++;
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                bitmap = null;
            } else {
                int i11 = 0;
                while (true) {
                    if (i11 >= k2Var.getChildCount()) {
                        w2Var = null;
                        break;
                    }
                    View childAt = k2Var.getChildAt(i11);
                    if (childAt instanceof w2) {
                        w2Var = (w2) childAt;
                        if (w2Var.P == photoEntry) {
                            break;
                        }
                    }
                    i11++;
                }
                bitmap = d(w2Var);
            }
            arrayList2.add(bitmap);
        }
    }

    public final int g() {
        int padding;
        k2 k2Var = this.d;
        if (k2Var == null || k2Var.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
            for (int i11 = 0; i11 < k2Var.getChildCount(); i11++) {
                View childAt = k2Var.getChildAt(i11);
                if (RecyclerView.R(childAt) > 0) {
                    i10 = Math.min(i10, (int) childAt.getY());
                }
            }
            padding = Math.max(0, Math.min(i10, getHeight()));
        }
        return k2Var == null ? padding : AndroidUtilities.lerp(0, padding, k2Var.getAlpha());
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.b0;
    }

    public String getTitle() {
        return LocaleController.getString(this.I ? R.string.AddImage : R.string.ChoosePhotoOrVideo);
    }

    public final void h() {
        a aVar;
        q2 q2Var = this.C;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q2Var.b;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.d();
        }
        ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.d0 = arrayList2;
        Collections.sort(arrayList2, new d4.t(arrayList, 5));
        ArrayList arrayList3 = this.V;
        boolean isEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = g0;
        if (!isEmpty) {
            ArrayList arrayList4 = this.d0;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, albumEntry);
        }
        boolean isEmpty2 = this.d0.isEmpty();
        TextView textView = this.y;
        if (isEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.B, (Drawable) null);
        int size = this.d0.size();
        for (int i10 = 0; i10 < size; i10++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.d0.get(i10);
            if (albumEntry2 == albumEntry) {
                aVar = new a(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), this.b);
            } else {
                ArrayList b10 = b(albumEntry2);
                if (!b10.isEmpty()) {
                    aVar = new a(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, b10.size(), this.b);
                }
            }
            q2Var.getPopupLayout().addView(aVar);
            aVar.setOnClickListener(new hb0(28, this, albumEntry2));
        }
    }

    public final void i() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d0;
        boolean z4 = true;
        boolean z10 = arrayList2 != null && !arrayList2.isEmpty() && this.d0.get(0) == this.b0 && this.V.size() > 2;
        this.W = z10;
        if (z10 || (this.b0 != g0 && ((arrayList = this.d0) == null || arrayList.isEmpty() || this.d0.get(0) != this.b0))) {
            z4 = false;
        }
        this.a0 = z4;
    }

    public final void j() {
        ArrayList arrayList = this.e0;
        boolean isEmpty = arrayList.isEmpty();
        boolean z4 = !isEmpty;
        ImageView imageView = this.E;
        if (imageView != null) {
            org.telegram.ui.b.p(imageView.animate().alpha(!isEmpty ? 1.0f : 0.0f).scaleX(!isEmpty ? 1.0f : 0.7f).scaleY(isEmpty ? 0.7f : 1.0f).translationY(!isEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)), pr.h, 320L);
        }
        LinearLayout linearLayout = this.F;
        if (linearLayout != null) {
            d dVar = this.G;
            if (dVar != null) {
                dVar.g(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true, true);
            }
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            if (this.Q != z4) {
                this.Q = z4;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(isEmpty ? 0.0f : 1.0f).translationY(isEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(pr.h).setDuration(320L).setListener(new vd1(9, this, z4)).start();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.a).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.a).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        w2.b0.clear();
        w2.c0.evictAll();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = w2.W;
            if (i10 >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((DispatchQueue) arrayList.get(i10)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i10)).recycle();
                i10++;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp;
        float f10;
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        k2 k2Var = this.d;
        k2Var.setPinnedSectionOffsetY(currentActionBarHeight);
        int dp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int dp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.F;
        if (linearLayout == null) {
            dp = 0;
        } else {
            dp = AndroidUtilities.dp((AndroidUtilities.navigationBarHeight > 0 ? 0 : 10) + 114);
        }
        k2Var.setPadding(dp2, currentActionBarHeight2, dp3, dp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.E;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        int i12 = AndroidUtilities.statusBarHeight;
        int dp4 = AndroidUtilities.dp(10.0f);
        TextView textView = this.y;
        textView.setPadding(0, i12, dp4, 0);
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f10 = 18.0f;
                textView.setTextSize(f10);
                super.onMeasure(i10, i11);
            }
        }
        f10 = 20.0f;
        textView.setTextSize(f10);
        super.onMeasure(i10, i11);
    }

    public void setMaxCount(int i10) {
        this.O = i10;
    }

    public void setMultipleOnClick(boolean z4) {
        if (this.N != z4) {
            this.N = z4;
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.S = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.T = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.U = callback3;
    }

    public void a() {
    }

    public void c(boolean z4) {
    }
}
