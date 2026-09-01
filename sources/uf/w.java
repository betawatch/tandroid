package uf;

import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public enum w {
    d(0, R.string.SearchMessagesFilterAll, R.string.SearchMessagesFilterAllFrom),
    /* JADX INFO: Fake field, exist only in values array */
    EF26(8, R.string.SearchMessagesFilterPrivate, R.string.SearchMessagesFilterPrivateFrom),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(4, R.string.SearchMessagesFilterGroup, R.string.SearchMessagesFilterGroupFrom),
    /* JADX INFO: Fake field, exist only in values array */
    EF52(2, R.string.SearchMessagesFilterChannels, R.string.SearchMessagesFilterChannelsFrom);

    public final int a;
    public final int b;
    public final int c;

    w(int i10, int i11, int i12) {
        this.a = i10;
        this.b = i11;
        this.c = i12;
    }
}
