package org.telegram.ui;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ TLRPC.InputPeer n;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ rf w;
    public final /* synthetic */ Object x;

    public /* synthetic */ sf(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, Object obj, boolean z10, rf rfVar, int i11) {
        this.a = i11;
        this.b = unVar;
        this.c = i10;
        this.d = arrayList;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.n = inputPeer;
        this.r = iArr;
        this.x = obj;
        this.s = z10;
        this.w = rfVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                un.y1(this.b, this.c, this.d, this.e, this.f, (String) this.h, this.n, this.r, (TL_iv.RichMessage) this.x, this.s, this.w);
                break;
            case 1:
                un.k0(this.b, this.c, this.d, this.e, this.f, (String) this.h, this.n, this.r, (CharSequence) this.x, this.s, this.w);
                break;
            default:
                un.M0(this.b, this.c, this.d, (String[]) this.h, this.e, this.f, this.n, this.r, (CharSequence) this.x, this.s, this.w);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sf(un unVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, rf rfVar) {
        this.a = 2;
        this.b = unVar;
        this.c = i10;
        this.d = arrayList;
        this.h = strArr;
        this.e = str;
        this.f = str2;
        this.n = inputPeer;
        this.r = iArr;
        this.x = charSequence;
        this.s = z10;
        this.w = rfVar;
    }
}
