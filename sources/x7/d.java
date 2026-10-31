package x7;

import java.util.Map;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class d implements Map.Entry {
    public final /* synthetic */ int a;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!w7.u8.a(getKey(), entry.getKey()) || !w7.u8.a(getValue(), entry.getValue())) {
                    }
                }
                break;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (!w7.s9.a(getKey(), entry2.getKey()) || !w7.s9.a(getValue(), entry2.getValue())) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        switch (this.a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return a1.g.C(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }

    public /* synthetic */ d(int i10, boolean z10) {
        this.a = i10;
    }
}
