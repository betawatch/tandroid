// default package

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ws6 extends id {
    public static final short G0;
    public int A0;
    public Interpolator B0;
    public final Interpolator C0;
    public final Interpolator D0;
    public Button E;
    public final AccessibilityManager E0;
    public Button F;
    public final ez3 F0;
    public ImageButton G;
    public MediaRouteExpandCollapseButton H;
    public FrameLayout I;
    public LinearLayout J;
    public FrameLayout K;
    public ImageView L;
    public TextView M;
    public TextView N;
    public TextView O;
    public final boolean P;
    public final boolean Q;
    public LinearLayout R;
    public RelativeLayout S;
    public LinearLayout T;
    public View U;
    public OverlayListView V;
    public vs6 W;
    public ArrayList X;
    public HashSet Y;
    public HashSet Z;
    public HashSet a0;
    public SeekBar b0;
    public us6 c0;
    public eu6 d0;
    public int e0;
    public int f0;
    public int g0;
    public final gu6 h;
    public final int h0;
    public HashMap i0;
    public wk4 j0;
    public final ts6 k0;
    public PlaybackStateCompat l0;
    public MediaDescriptionCompat m0;
    public final gs6 n;
    public ss6 n0;
    public Bitmap o0;
    public Uri p0;
    public boolean q0;
    public final eu6 r;
    public Bitmap r0;
    public final Context s;
    public int s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public boolean x0;
    public int y;
    public int y0;
    public int z0;

    static {
        Log.isLoggable("MediaRouteCtrlDialog", 3);
        G0 = (short) 30000;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ws6(Context context) {
        super(r5, r1 == 0 ? voe.e(r5) : r1);
        byte b = 1;
        ContextThemeWrapper a = voe.a(context, true);
        int g = voe.g(a, R.attr.mediaRouteTheme);
        this.P = true;
        this.F0 = new ez3(this, (byte) 26);
        Context context2 = getContext();
        this.s = context2;
        this.k0 = new ts6(this, (byte) 0);
        this.h = gu6.d(context2);
        this.Q = gu6.g();
        this.n = new gs6(this, b);
        this.r = gu6.f();
        p(gu6.e());
        this.h0 = context2.getResources().getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_padding_top);
        this.E0 = (AccessibilityManager) context2.getSystemService("accessibility");
        this.C0 = AnimationUtils.loadInterpolator(a, R.interpolator.mr_linear_out_slow_in);
        this.D0 = AnimationUtils.loadInterpolator(a, R.interpolator.mr_fast_out_slow_in);
    }

    public static void o(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }

    public final void f(int i, View view) {
        ps6 ps6Var = new ps6(view.getLayoutParams().height, i, view, (byte) 0);
        ps6Var.setDuration(this.y0);
        ps6Var.setInterpolator(this.B0);
        view.startAnimation(ps6Var);
    }

    public final boolean h() {
        return (this.m0 == null && this.l0 == null) ? false : true;
    }

    public final void i(boolean z) {
        OverlayListView overlayListView;
        HashSet hashSet;
        int firstVisiblePosition = this.V.getFirstVisiblePosition();
        int i = 0;
        while (true) {
            int childCount = this.V.getChildCount();
            overlayListView = this.V;
            if (i >= childCount) {
                break;
            }
            View childAt = overlayListView.getChildAt(i);
            eu6 eu6Var = (eu6) this.W.getItem(firstVisiblePosition + i);
            if (!z || (hashSet = this.Y) == null || !hashSet.contains(eu6Var)) {
                ((LinearLayout) childAt.findViewById(R.id.volume_item_container)).setVisibility(0);
                AnimationSet animationSet = new AnimationSet(true);
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 1.0f);
                alphaAnimation.setDuration(0L);
                animationSet.addAnimation(alphaAnimation);
                new TranslateAnimation(0.0f, 0.0f, 0.0f, 0.0f).setDuration(0L);
                animationSet.setFillAfter(true);
                animationSet.setFillEnabled(true);
                childAt.clearAnimation();
                childAt.startAnimation(animationSet);
            }
            i++;
        }
        ArrayList arrayList = overlayListView.a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            hr7 hr7Var = (hr7) obj;
            hr7Var.j = true;
            hr7Var.k = true;
            wk4 wk4Var = hr7Var.l;
            if (wk4Var != null) {
                ws6 ws6Var = (ws6) wk4Var.c;
                ws6Var.a0.remove((eu6) wk4Var.b);
                ws6Var.W.notifyDataSetChanged();
            }
        }
        if (z) {
            return;
        }
        j(false);
    }

    public final void j(boolean z) {
        this.Y = null;
        this.Z = null;
        this.w0 = false;
        if (this.x0) {
            this.x0 = false;
            t(z);
        }
        this.V.setEnabled(true);
    }

    public final int k(int i, int i2) {
        float f = this.y;
        return (int) (i >= i2 ? ((f * i2) / i) + 0.5f : ls6.d(f, 9.0f, 16.0f, 0.5f));
    }

    public final int l(boolean z) {
        if (!z && this.T.getVisibility() != 0) {
            return 0;
        }
        int paddingBottom = this.R.getPaddingBottom() + this.R.getPaddingTop();
        if (z) {
            paddingBottom += this.S.getMeasuredHeight();
        }
        if (this.T.getVisibility() == 0) {
            paddingBottom += this.T.getMeasuredHeight();
        }
        return (z && this.T.getVisibility() == 0) ? this.U.getMeasuredHeight() + paddingBottom : paddingBottom;
    }

    public final boolean n() {
        eu6 eu6Var = this.r;
        return eu6Var.e() && DesugarCollections.unmodifiableList(eu6Var.v).size() > 1;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.x = true;
        this.h.a(yt6.c, this.n, 2);
        p(gu6.e());
    }

    @Override // id, dp, yp2, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        setContentView(R.layout.mr_controller_material_dialog_b);
        findViewById(android.R.id.button3).setVisibility(8);
        rs6 rs6Var = new rs6(this, (byte) 0);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.mr_expandable_area);
        this.I = frameLayout;
        frameLayout.setOnClickListener(new rs6(this, (byte) 1));
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.mr_dialog_area);
        this.J = linearLayout;
        linearLayout.setOnClickListener(new ns6());
        Context context = this.s;
        int f = voe.f(context, R.attr.colorPrimary);
        if (bm2.g(f, voe.f(context, android.R.attr.colorBackground)) < 3.0d) {
            f = voe.f(context, R.attr.colorAccent);
        }
        Button button = (Button) findViewById(android.R.id.button2);
        this.E = button;
        button.setText(R.string.mr_controller_disconnect);
        this.E.setTextColor(f);
        this.E.setOnClickListener(rs6Var);
        Button button2 = (Button) findViewById(android.R.id.button1);
        this.F = button2;
        button2.setText(R.string.mr_controller_stop_casting);
        this.F.setTextColor(f);
        this.F.setOnClickListener(rs6Var);
        this.O = (TextView) findViewById(R.id.mr_name);
        ((ImageButton) findViewById(R.id.mr_close)).setOnClickListener(rs6Var);
        this.K = (FrameLayout) findViewById(R.id.mr_default_control);
        rs6 rs6Var2 = new rs6(this, (byte) 2);
        ImageView imageView = (ImageView) findViewById(R.id.mr_art);
        this.L = imageView;
        imageView.setOnClickListener(rs6Var2);
        findViewById(R.id.mr_control_title_container).setOnClickListener(rs6Var2);
        this.R = (LinearLayout) findViewById(R.id.mr_media_main_control);
        this.U = findViewById(R.id.mr_control_divider);
        this.S = (RelativeLayout) findViewById(R.id.mr_playback_control);
        this.M = (TextView) findViewById(R.id.mr_control_title);
        this.N = (TextView) findViewById(R.id.mr_control_subtitle);
        ImageButton imageButton = (ImageButton) findViewById(R.id.mr_control_playback_ctrl);
        this.G = imageButton;
        imageButton.setOnClickListener(rs6Var);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.mr_volume_control);
        this.T = linearLayout2;
        linearLayout2.setVisibility(8);
        SeekBar seekBar = (SeekBar) findViewById(R.id.mr_volume_slider);
        this.b0 = seekBar;
        eu6 eu6Var = this.r;
        seekBar.setTag(eu6Var);
        us6 us6Var = new us6(this);
        this.c0 = us6Var;
        this.b0.setOnSeekBarChangeListener(us6Var);
        this.V = (OverlayListView) findViewById(R.id.mr_volume_group_list);
        this.X = new ArrayList();
        vs6 vs6Var = new vs6(this, this.V.getContext(), this.X);
        this.W = vs6Var;
        this.V.setAdapter((ListAdapter) vs6Var);
        this.a0 = new HashSet();
        LinearLayout linearLayout3 = this.R;
        OverlayListView overlayListView = this.V;
        boolean n = n();
        int f2 = voe.f(context, R.attr.colorPrimary);
        int f3 = voe.f(context, R.attr.colorPrimaryDark);
        if (n && voe.b(context) == -570425344) {
            f3 = f2;
            f2 = -1;
        }
        linearLayout3.setBackgroundColor(f2);
        overlayListView.setBackgroundColor(f3);
        linearLayout3.setTag(Integer.valueOf(f2));
        overlayListView.setTag(Integer.valueOf(f3));
        MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) this.b0;
        LinearLayout linearLayout4 = this.R;
        int b = voe.b(context);
        if (Color.alpha(b) != 255) {
            b = bm2.k(b, ((Integer) linearLayout4.getTag()).intValue());
        }
        mediaRouteVolumeSlider.a(b, b);
        HashMap hashMap = new HashMap();
        this.i0 = hashMap;
        hashMap.put(eu6Var, this.b0);
        MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) findViewById(R.id.mr_group_expand_collapse);
        this.H = mediaRouteExpandCollapseButton;
        mediaRouteExpandCollapseButton.r = new rs6(this, (byte) 3);
        this.B0 = this.v0 ? this.C0 : this.D0;
        this.y0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_animation_duration_ms);
        this.z0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_in_duration_ms);
        this.A0 = context.getResources().getInteger(R.integer.mr_controller_volume_group_list_fade_out_duration_ms);
        this.w = true;
        s();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.h.h(this.n);
        p(null);
        this.x = false;
        super.onDetachedFromWindow();
    }

    @Override // id, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.Q || !this.v0) {
            this.r.k(i == 25 ? -1 : 1);
        }
        return true;
    }

    @Override // id, android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 25 || i == 24) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void p(MediaSessionCompat$Token mediaSessionCompat$Token) {
        MediaMetadataCompat mediaMetadataCompat;
        PlaybackStateCompat h;
        wk4 wk4Var = this.j0;
        ts6 ts6Var = this.k0;
        if (wk4Var != null) {
            wk4Var.h0(ts6Var);
            this.j0 = null;
        }
        if (mediaSessionCompat$Token == null || !this.x) {
            return;
        }
        wk4 wk4Var2 = new wk4(this.s, mediaSessionCompat$Token);
        this.j0 = wk4Var2;
        wk4Var2.e0(ts6Var);
        MediaMetadata metadata = ((a) this.j0.b).a.getMetadata();
        if (metadata != null) {
            ps psVar = MediaMetadataCompat.d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            mediaMetadataCompat = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            mediaMetadataCompat.b = metadata;
        } else {
            mediaMetadataCompat = null;
        }
        this.m0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
        a aVar = (a) this.j0.b;
        MediaSessionCompat$Token mediaSessionCompat$Token2 = aVar.e;
        if (mediaSessionCompat$Token2.a() != null) {
            try {
                h = mediaSessionCompat$Token2.a().h();
            } catch (RemoteException e) {
                Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            }
            this.l0 = h;
            r();
            q(false);
        }
        PlaybackState playbackState = aVar.a.getPlaybackState();
        h = playbackState != null ? PlaybackStateCompat.a(playbackState) : null;
        this.l0 = h;
        r();
        q(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z) {
        boolean z2;
        boolean z3;
        PlaybackStateCompat playbackStateCompat;
        int i;
        int i2;
        boolean z4 = true;
        if (this.d0 != null) {
            this.t0 = true;
            this.u0 |= z;
            return;
        }
        this.t0 = false;
        this.u0 = false;
        eu6 eu6Var = this.r;
        if (!eu6Var.g() || eu6Var.d()) {
            dismiss();
            return;
        }
        if (this.w) {
            this.O.setText(eu6Var.d);
            this.E.setVisibility(eu6Var.j ? 0 : 8);
            if (this.q0) {
                Bitmap bitmap = this.r0;
                if (bitmap == null || !bitmap.isRecycled()) {
                    this.L.setImageBitmap(this.r0);
                    this.L.setBackgroundColor(this.s0);
                } else {
                    Log.w("MediaRouteCtrlDialog", "Can't set artwork image with recycled bitmap: " + this.r0);
                }
                this.q0 = false;
                this.r0 = null;
                this.s0 = 0;
            }
            boolean z5 = this.Q;
            if (z5 || !n()) {
                if ((!this.v0 || z5) && this.P) {
                    if (((!eu6Var.e() || gu6.g()) ? eu6Var.o : 0) == 1) {
                        if (this.T.getVisibility() == 8) {
                            this.T.setVisibility(0);
                            this.b0.setMax(eu6Var.q);
                            this.b0.setProgress(eu6Var.p);
                            this.H.setVisibility(n() ? 0 : 8);
                        }
                    }
                }
                this.T.setVisibility(8);
            } else {
                this.T.setVisibility(8);
                this.v0 = true;
                this.V.setVisibility(0);
                this.B0 = this.v0 ? this.C0 : this.D0;
                t(false);
            }
            if (h()) {
                MediaDescriptionCompat mediaDescriptionCompat = this.m0;
                CharSequence charSequence = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.b;
                boolean isEmpty = TextUtils.isEmpty(charSequence);
                MediaDescriptionCompat mediaDescriptionCompat2 = this.m0;
                CharSequence charSequence2 = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.c : null;
                boolean isEmpty2 = TextUtils.isEmpty(charSequence2);
                if (eu6Var.r != -1) {
                    this.M.setText(R.string.mr_controller_casting_screen);
                } else {
                    PlaybackStateCompat playbackStateCompat2 = this.l0;
                    if (playbackStateCompat2 == null || playbackStateCompat2.a == 0) {
                        this.M.setText(R.string.mr_controller_no_media_selected);
                    } else {
                        if (!isEmpty) {
                            this.M.setText(charSequence);
                            z2 = true;
                        } else if (isEmpty2) {
                            this.M.setText(R.string.mr_controller_no_info_available);
                        } else {
                            z2 = false;
                        }
                        if (isEmpty2) {
                            z3 = false;
                        } else {
                            this.N.setText(charSequence2);
                            z3 = true;
                        }
                        this.M.setVisibility(!z2 ? 0 : 8);
                        this.N.setVisibility(!z3 ? 0 : 8);
                        playbackStateCompat = this.l0;
                        if (playbackStateCompat != null) {
                            int i3 = playbackStateCompat.a;
                            boolean z6 = i3 == 6 || i3 == 3;
                            Context context = this.G.getContext();
                            PlaybackStateCompat playbackStateCompat3 = this.l0;
                            if (z6) {
                                long j = playbackStateCompat3.e;
                                if ((514 & j) != 0) {
                                    i = R.attr.mediaRoutePauseDrawable;
                                    i2 = R.string.mr_controller_pause;
                                } else {
                                    if ((j & 1) != 0) {
                                        i = R.attr.mediaRouteStopDrawable;
                                        i2 = R.string.mr_controller_stop;
                                    }
                                    z4 = false;
                                    i = 0;
                                    i2 = 0;
                                }
                                this.G.setVisibility(z4 ? 0 : 8);
                                if (z4) {
                                    this.G.setImageResource(voe.g(context, i));
                                    this.G.setContentDescription(context.getResources().getText(i2));
                                }
                            } else {
                                if ((playbackStateCompat3.e & 516) != 0) {
                                    i = R.attr.mediaRoutePlayDrawable;
                                    i2 = R.string.mr_controller_play;
                                    this.G.setVisibility(z4 ? 0 : 8);
                                    if (z4) {
                                    }
                                }
                                z4 = false;
                                i = 0;
                                i2 = 0;
                                this.G.setVisibility(z4 ? 0 : 8);
                                if (z4) {
                                }
                            }
                        }
                    }
                }
                z3 = false;
                z2 = true;
                this.M.setVisibility(!z2 ? 0 : 8);
                this.N.setVisibility(!z3 ? 0 : 8);
                playbackStateCompat = this.l0;
                if (playbackStateCompat != null) {
                }
            }
            t(z);
        }
    }

    public final void r() {
        Bitmap bitmap;
        Uri uri;
        Uri uri2;
        Bitmap bitmap2;
        MediaDescriptionCompat mediaDescriptionCompat = this.m0;
        if (mediaDescriptionCompat == null) {
            uri = null;
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.e;
            uri = mediaDescriptionCompat.f;
        }
        ss6 ss6Var = this.n0;
        if (ss6Var == null) {
            bitmap2 = this.o0;
            uri2 = this.p0;
        } else {
            Bitmap bitmap3 = ss6Var.a;
            uri2 = ss6Var.b;
            bitmap2 = bitmap3;
        }
        if (bitmap2 == bitmap) {
            if (bitmap2 != null) {
                return;
            }
            if (uri2 != null) {
                if (uri2.equals(uri)) {
                    return;
                }
            } else if (uri == null) {
                return;
            }
        }
        if (!n() || this.Q) {
            ss6 ss6Var2 = this.n0;
            if (ss6Var2 != null) {
                ss6Var2.cancel(true);
            }
            ss6 ss6Var3 = new ss6(this);
            this.n0 = ss6Var3;
            ss6Var3.execute(new Void[0]);
        }
    }

    public final void s() {
        Context context = this.s;
        int a = roe.a(context);
        getWindow().setLayout(a, -2);
        View decorView = getWindow().getDecorView();
        this.y = (a - decorView.getPaddingLeft()) - decorView.getPaddingRight();
        Resources resources = context.getResources();
        this.e0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_icon_size);
        this.f0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_item_height);
        this.g0 = resources.getDimensionPixelSize(R.dimen.mr_controller_volume_group_list_max_height);
        this.o0 = null;
        this.p0 = null;
        r();
        q(false);
    }

    public final void t(boolean z) {
        this.K.requestLayout();
        this.K.getViewTreeObserver().addOnGlobalLayoutListener(new os6(this, z));
    }

    public final void u(boolean z) {
        int i = 0;
        this.U.setVisibility((this.T.getVisibility() == 0 && z) ? 0 : 8);
        LinearLayout linearLayout = this.R;
        if (this.T.getVisibility() == 8 && !z) {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }
}
