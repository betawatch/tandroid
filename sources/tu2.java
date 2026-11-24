// default package

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tu2 implements RemoteViewsService.RemoteViewsFactory {
    public ArrayList a;
    public Context b;
    public int c;
    public j5 d;
    public Paint e;
    public RectF f;
    public vf6 g;
    public boolean h;

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        if (this.h) {
            return 1;
        }
        return ((int) Math.ceil(this.a.size() / 2.0f)) + 1;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0281  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r0v41, types: [pb0] */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v57 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r13v12, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [org.telegram.tgnet.TLObject] */
    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final RemoteViews getViewAt(int i) {
        String str;
        String str2;
        ?? r12;
        ?? r0;
        TLRPC.FileLocation fileLocation;
        ?? r14;
        String str3;
        int i2;
        TLRPC.Dialog dialog;
        int i3;
        int i4;
        int i5;
        String format;
        ?? r13;
        Canvas canvas;
        pb0 pb0Var;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation2;
        ArrayList arrayList = this.a;
        Context context = this.b;
        j5 j5Var = this.d;
        String str4 = null;
        if (this.h) {
            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.widget_deleted);
            remoteViews.setTextViewText(R.id.widget_deleted_text, k96.M0(2131742611, null));
            return remoteViews;
        }
        if (i >= getCount() - 1) {
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), R.layout.widget_edititem);
            remoteViews2.setTextViewText(R.id.widget_edititem_text, k96.M0(2131744015, null));
            Bundle bundle = new Bundle();
            bundle.putInt("appWidgetId", this.c);
            bundle.putInt("appWidgetType", 1);
            bundle.putInt("currentAccount", j5Var.a);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            remoteViews2.setOnClickFillInIntent(R.id.widget_edititem, intent);
            return remoteViews2;
        }
        RemoteViews remoteViews3 = new RemoteViews(context.getPackageName(), R.layout.contacts_widget_item);
        int i6 = 0;
        int i7 = 0;
        while (i7 < 2) {
            int i8 = (i << 1) + i7;
            if (i8 >= arrayList.size()) {
                remoteViews3.setViewVisibility(i7 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, 4);
                str3 = str4;
                i4 = i6;
            } else {
                remoteViews3.setViewVisibility(i7 == 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, i6);
                Long l = (Long) arrayList.get(i8);
                if (cf3.D(l.longValue())) {
                    TLRPC.User V1 = na7.q1(j5Var.a).V1(l);
                    String M0 = l7c.C(V1) ? k96.M0(2131745709, str4) : l7c.A(V1) ? k96.M0(2131746073, str4) : l7c.y(V1) ? k96.M0(2131749136, str4) : l7c.k(V1, true);
                    if (l7c.A(V1) || l7c.C(V1) || V1 == null || (userProfilePhoto = V1.photo) == null || (fileLocation2 = userProfilePhoto.photo_small) == null || fileLocation2.volume_id == 0 || fileLocation2.local_id == 0) {
                        String str5 = str4;
                        str2 = M0;
                        r12 = str5;
                        r0 = V1;
                        r14 = str5;
                    } else {
                        r14 = fileLocation2;
                        str2 = M0;
                        r12 = str4;
                        r0 = V1;
                    }
                } else {
                    TLRPC.Chat K0 = na7.q1(j5Var.a).K0(Long.valueOf(-l.longValue()));
                    if (K0 != null) {
                        str = K0.title;
                        TLRPC.ChatPhoto chatPhoto = K0.photo;
                        if (chatPhoto != null && (fileLocation = chatPhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                            r14 = fileLocation;
                            str2 = str;
                            r12 = K0;
                            r0 = str4;
                        }
                    } else {
                        str = "";
                    }
                    String str6 = str4;
                    str2 = str;
                    r12 = K0;
                    r0 = str6;
                    r14 = str6;
                }
                remoteViews3.setTextViewText(i7 == 0 ? R.id.contacts_widget_item_text1 : R.id.contacts_widget_item_text2, str2);
                if (r14 != 0) {
                    try {
                        ba4.G(y6c.t0);
                        r13 = BitmapFactory.decodeFile(ba4.J(r14, str4, true, true).toString());
                    } catch (Throwable th) {
                        th = th;
                        str3 = str4;
                        i2 = i6;
                        fa4.g(th, true);
                        dialog = (TLRPC.Dialog) this.g.f(l.longValue());
                        i3 = R.id.contacts_widget_item_badge_bg2;
                        if (dialog != null) {
                        }
                        i4 = i2;
                        if (i7 == 0) {
                        }
                        remoteViews3.setViewVisibility(i3, 8);
                        Bundle bundle2 = new Bundle();
                        if (cf3.D(l.longValue())) {
                        }
                        bundle2.putInt("currentAccount", j5Var.a);
                        Intent intent2 = new Intent();
                        intent2.putExtras(bundle2);
                        remoteViews3.setOnClickFillInIntent(i7 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2);
                        i7++;
                        i6 = i4;
                        str4 = str3;
                    }
                } else {
                    r13 = str4;
                }
                int L = gl.L(48.0f);
                Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(i6);
                try {
                    canvas = new Canvas(createBitmap);
                    if (r13 == 0) {
                        if (r0 != 0) {
                            pb0Var = new pb0(i6, r0);
                            if (l7c.A(r0)) {
                                pb0Var.f(12);
                            } else if (l7c.C(r0)) {
                                pb0Var.f(1);
                            }
                        } else {
                            ?? pb0Var2 = new pb0((wjb) null);
                            int i9 = j5Var.a;
                            pb0Var2.p(r12);
                            pb0Var = pb0Var2;
                        }
                        pb0Var.setBounds(i6, i6, L, L);
                        pb0Var.draw(canvas);
                        i2 = i6;
                    } else {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(r13, tileMode, tileMode);
                        if (this.e == null) {
                            this.e = new Paint(1);
                            this.f = new RectF();
                        }
                        float width = L / r13.getWidth();
                        canvas.save();
                        canvas.scale(width, width);
                        this.e.setShader(bitmapShader);
                        i2 = i6;
                        try {
                            this.f.set(0.0f, 0.0f, r13.getWidth(), r13.getHeight());
                            canvas.drawRoundRect(this.f, r13.getWidth(), r13.getHeight(), this.e);
                            canvas.restore();
                        } catch (Throwable th2) {
                            th = th2;
                            str3 = null;
                            fa4.g(th, true);
                            dialog = (TLRPC.Dialog) this.g.f(l.longValue());
                            i3 = R.id.contacts_widget_item_badge_bg2;
                            if (dialog != null) {
                            }
                            i4 = i2;
                            if (i7 == 0) {
                            }
                            remoteViews3.setViewVisibility(i3, 8);
                            Bundle bundle22 = new Bundle();
                            if (cf3.D(l.longValue())) {
                            }
                            bundle22.putInt("currentAccount", j5Var.a);
                            Intent intent22 = new Intent();
                            intent22.putExtras(bundle22);
                            remoteViews3.setOnClickFillInIntent(i7 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent22);
                            i7++;
                            i6 = i4;
                            str4 = str3;
                        }
                    }
                    str3 = null;
                } catch (Throwable th3) {
                    th = th3;
                    i2 = i6;
                }
                try {
                    canvas.setBitmap(null);
                    remoteViews3.setImageViewBitmap(i7 == 0 ? R.id.contacts_widget_item_avatar1 : R.id.contacts_widget_item_avatar2, createBitmap);
                } catch (Throwable th4) {
                    th = th4;
                    fa4.g(th, true);
                    dialog = (TLRPC.Dialog) this.g.f(l.longValue());
                    i3 = R.id.contacts_widget_item_badge_bg2;
                    if (dialog != null) {
                    }
                    i4 = i2;
                    if (i7 == 0) {
                    }
                    remoteViews3.setViewVisibility(i3, 8);
                    Bundle bundle222 = new Bundle();
                    if (cf3.D(l.longValue())) {
                    }
                    bundle222.putInt("currentAccount", j5Var.a);
                    Intent intent222 = new Intent();
                    intent222.putExtras(bundle222);
                    remoteViews3.setOnClickFillInIntent(i7 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent222);
                    i7++;
                    i6 = i4;
                    str4 = str3;
                }
                dialog = (TLRPC.Dialog) this.g.f(l.longValue());
                i3 = R.id.contacts_widget_item_badge_bg2;
                if (dialog != null || (i5 = dialog.unread_count) <= 0) {
                    i4 = i2;
                    if (i7 == 0) {
                        i3 = R.id.contacts_widget_item_badge_bg1;
                    }
                    remoteViews3.setViewVisibility(i3, 8);
                } else {
                    if (i5 > 99) {
                        Object[] objArr = new Object[1];
                        objArr[i2] = 99;
                        format = String.format("%d+", objArr);
                    } else {
                        Object[] objArr2 = new Object[1];
                        objArr2[i2] = Integer.valueOf(i5);
                        format = String.format("%d", objArr2);
                    }
                    remoteViews3.setTextViewText(i7 == 0 ? R.id.contacts_widget_item_badge1 : R.id.contacts_widget_item_badge2, format);
                    if (i7 == 0) {
                        i3 = R.id.contacts_widget_item_badge_bg1;
                    }
                    i4 = i2;
                    remoteViews3.setViewVisibility(i3, i4);
                }
                Bundle bundle2222 = new Bundle();
                if (cf3.D(l.longValue())) {
                    bundle2222.putLong("chatId", -l.longValue());
                } else {
                    bundle2222.putLong("userId", l.longValue());
                }
                bundle2222.putInt("currentAccount", j5Var.a);
                Intent intent2222 = new Intent();
                intent2222.putExtras(bundle2222);
                remoteViews3.setOnClickFillInIntent(i7 != 0 ? R.id.contacts_widget_item1 : R.id.contacts_widget_item2, intent2222);
            }
            i7++;
            i6 = i4;
            str4 = str3;
        }
        return remoteViews3;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        return true;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
        a.v();
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        ArrayList arrayList = this.a;
        arrayList.clear();
        j5 j5Var = this.d;
        if (j5Var != null) {
            int i = j5Var.a;
            if (y6c.h(i).o()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                vf6 vf6Var = new vf6();
                ad7 Y = ad7.Y(i);
                int i2 = this.c;
                vf6 vf6Var2 = this.g;
                CountDownLatch countDownLatch = new CountDownLatch(1);
                Y.a.c(new ic7(Y, i2, arrayList, 1, vf6Var2, vf6Var, arrayList3, arrayList2, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (Exception e) {
                    Y.n(e, true);
                }
                na7.q1(i).a4(arrayList2, true);
                na7.q1(i).U3(arrayList3, true);
            }
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
    }
}
