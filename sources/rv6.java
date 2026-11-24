// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rv6 extends dq {
    public static final /* synthetic */ int k0 = 0;
    public final Context E;
    public boolean F;
    public boolean G;
    public long H;
    public final c1 I;
    public RecyclerView J;
    public pv6 K;
    public qv6 L;
    public HashMap M;
    public ew6 N;
    public HashMap O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ImageButton S;
    public Button T;
    public ImageView U;
    public View V;
    public ImageView W;
    public TextView X;
    public TextView Y;
    public String Z;
    public wm4 a0;
    public final tu6 b0;
    public MediaDescriptionCompat c0;
    public iv6 d0;
    public Bitmap e0;
    public final gw6 f;
    public Uri f0;
    public boolean g0;
    public final hu6 h;
    public Bitmap h0;
    public int i0;
    public final boolean j0;
    public yv6 n;
    public ew6 r;
    public final ArrayList s;
    public final ArrayList w;
    public final ArrayList x;
    public final ArrayList y;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rv6(Context context) {
        super(r2, r0 == 0 ? yqe.e(r2) : r0);
        ContextThemeWrapper a = yqe.a(context, false);
        int g = yqe.g(a, R.attr.mediaRouteTheme);
        this.n = yv6.c;
        this.s = new ArrayList();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new ArrayList();
        this.I = new c1((Object) this, (byte) 9);
        Context context2 = getContext();
        this.E = context2;
        this.f = gw6.d(context2);
        this.j0 = gw6.g();
        this.h = new hu6(this, (byte) 3);
        this.r = gw6.f();
        this.b0 = new tu6(this, (byte) 1);
        h(gw6.e());
    }

    public final void e(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ew6 ew6Var = (ew6) list.get(size);
            if (ew6Var.d() || !ew6Var.g || !ew6Var.h(this.n) || this.r == ew6Var) {
                list.remove(size);
            }
        }
    }

    public final void f() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
            uri = mediaDescriptionCompat.f;
        }
        iv6 iv6Var = this.d0;
        if (iv6Var == null) {
            bitmap2 = this.e0;
            uri2 = this.f0;
        } else {
            Bitmap bitmap3 = iv6Var.a;
            uri2 = iv6Var.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 != bitmap || (bitmap2 == null && !Objects.equals(uri2, uri))) {
            iv6 iv6Var2 = this.d0;
            if (iv6Var2 != null) {
                iv6Var2.cancel(true);
            }
            iv6 iv6Var3 = new iv6(this);
            this.d0 = iv6Var3;
            iv6Var3.execute(new Void[0]);
        }
    }

    public final void h(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        wm4 wm4Var = this.a0;
        tu6 tu6Var = this.b0;
        if (wm4Var != null) {
            wm4Var.g0(tu6Var);
            this.a0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.G) {
            return;
        }
        wm4 wm4Var2 = new wm4(this.E, mediaSessionCompat$Token);
        this.a0 = wm4Var2;
        wm4Var2.d0(tu6Var);
        MediaMetadata metadata = ((a) this.a0.b).a.getMetadata();
        if (metadata != null) {
            qt qtVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.b = metadata;
        } else {
            mediaMetadataCompat = null;
        }
        this.c0 = mediaMetadataCompat != null ? mediaMetadataCompat.a() : null;
        f();
        k();
    }

    public final void i(yv6 yv6Var) {
        if (yv6Var == null) {
            u36.j("selector must not be null");
            return;
        }
        if (this.n.equals(yv6Var)) {
            return;
        }
        this.n = yv6Var;
        if (this.G) {
            gw6 gw6Var = this.f;
            hu6 hu6Var = this.h;
            gw6Var.h(hu6Var);
            gw6Var.a(yv6Var, hu6Var, 1);
            l();
        }
    }

    public final void j() {
        Context context = this.E;
        getWindow().setLayout(!context.getResources().getBoolean(R.bool.is_tablet) ? -1 : uqe.a(context), context.getResources().getBoolean(R.bool.is_tablet) ? -2 : -1);
        this.e0 = null;
        this.f0 = null;
        f();
        k();
        n();
    }

    public final void k() {
        Bitmap bitmap;
        if ((this.N != null || this.P) ? true : !this.F) {
            this.R = true;
            return;
        }
        this.R = false;
        if (!this.r.g() || this.r.d()) {
            dismiss();
        }
        if (!this.g0 || (((bitmap = this.h0) != null && bitmap.isRecycled()) || this.h0 == null)) {
            Bitmap bitmap2 = this.h0;
            if (bitmap2 != null && bitmap2.isRecycled()) {
                Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.h0);
            }
            this.W.setVisibility(8);
            this.V.setVisibility(8);
            this.U.setImageBitmap(null);
        } else {
            this.W.setVisibility(0);
            this.W.setImageBitmap(this.h0);
            this.W.setBackgroundColor(this.i0);
            this.V.setVisibility(0);
            Bitmap bitmap3 = this.h0;
            RenderScript create = RenderScript.create(this.E);
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap3);
            Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            create2.setRadius(10.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createTyped);
            Bitmap copy = bitmap3.copy(bitmap3.getConfig(), true);
            createTyped.copyTo(copy);
            createFromBitmap.destroy();
            createTyped.destroy();
            create2.destroy();
            create.destroy();
            this.U.setImageBitmap(copy);
        }
        this.g0 = false;
        this.h0 = null;
        this.i0 = 0;
        MediaDescriptionCompat mediaDescriptionCompat = this.c0;
        CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        MediaDescriptionCompat mediaDescriptionCompat2 = this.c0;
        CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
        boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
        TextView textView = this.X;
        if (isEmpty) {
            textView.setText(this.Z);
        } else {
            textView.setText(charSequence);
        }
        TextView textView2 = this.Y;
        if (isEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(charSequence2);
            this.Y.setVisibility(0);
        }
    }

    public final void l() {
        ArrayList arrayList = this.s;
        arrayList.clear();
        ArrayList arrayList2 = this.w;
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        arrayList3.clear();
        arrayList.addAll(DesugarCollections.unmodifiableList(this.r.v));
        dw6 dw6Var = this.r.a;
        gw6.b();
        for (ew6 ew6Var : DesugarCollections.unmodifiableList(dw6Var.b)) {
            k44 b = this.r.b(ew6Var);
            if (b != null) {
                tv6 tv6Var = (tv6) b.b;
                if (tv6Var != null && tv6Var.d) {
                    arrayList2.add(ew6Var);
                }
                if (tv6Var != null && tv6Var.e) {
                    arrayList3.add(ew6Var);
                }
            }
        }
        e(arrayList2);
        e(arrayList3);
        ju6 ju6Var = ju6.d;
        Collections.sort(arrayList, ju6Var);
        Collections.sort(arrayList2, ju6Var);
        Collections.sort(arrayList3, ju6Var);
        this.K.G();
    }

    public final void n() {
        if (this.G) {
            if (SystemClock.uptimeMillis() - this.H < 300) {
                c1 c1Var = this.I;
                c1Var.removeMessages(1);
                c1Var.sendEmptyMessageAtTime(1, this.H + 300);
                return;
            }
            if ((this.N != null || this.P) ? true : !this.F) {
                this.Q = true;
                return;
            }
            this.Q = false;
            if (!this.r.g() || this.r.d()) {
                dismiss();
            }
            this.H = SystemClock.uptimeMillis();
            this.K.F();
        }
    }

    public final void o() {
        if (this.Q) {
            n();
        }
        if (this.R) {
            k();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        this.f.a(this.n, this.h, 1);
        l();
        h(gw6.e());
    }

    @Override // dq, jr2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mr_cast_dialog);
        View decorView = getWindow().getDecorView();
        Context context = this.E;
        decorView.setBackgroundColor(context.getColor(yqe.h(context) ? R.color.mr_dynamic_dialog_background_light : R.color.mr_dynamic_dialog_background_dark));
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_cast_close_button);
        this.S = imageButton;
        imageButton.setColorFilter(-1);
        this.S.setOnClickListener(new hv6(this, (byte) 0));
        Button button = (Button) findViewById(R.id.mr_cast_stop_button);
        this.T = button;
        button.setTextColor(-1);
        this.T.setOnClickListener(new hv6(this, (byte) 1));
        this.K = new pv6(this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.mr_cast_list);
        this.J = recyclerView;
        recyclerView.setAdapter(this.K);
        this.J.setLayoutManager(new u46());
        this.L = new qv6(this);
        this.M = new HashMap();
        this.O = new HashMap();
        this.U = (ImageView) findViewById(R.id.mr_cast_meta_background);
        this.V = findViewById(R.id.mr_cast_meta_black_scrim);
        this.W = (ImageView) findViewById(R.id.mr_cast_meta_art);
        TextView textView = (TextView) findViewById(R.id.mr_cast_meta_title);
        this.X = textView;
        textView.setTextColor(-1);
        TextView textView2 = (TextView) findViewById(R.id.mr_cast_meta_subtitle);
        this.Y = textView2;
        textView2.setTextColor(-1);
        this.Z = context.getResources().getString(R.string.mr_cast_dialog_title_view_placeholder);
        this.F = true;
        j();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.f.h(this.h);
        this.I.removeCallbacksAndMessages(null);
        h(null);
    }
}
